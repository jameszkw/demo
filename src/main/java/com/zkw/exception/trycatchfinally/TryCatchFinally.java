package com.zkw.exception.trycatchfinally;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-18 下午 6:36
 **/

public class TryCatchFinally {
    /**
     * 情况一
     *
     * @return
     */
    public int launch() {
        try {
            System.out.println("run in try region");
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("run in catch region");
            return -1;
        } finally {
            System.out.println("run in finally region");
//            return 1;
        }

    }

    /**
     * 情况二
     * 情况一和情况二，说明无论是在try语句块，还是在catch语句块中，即使存在return，
     * finally也会照样执行。如果一定要强制不让finally执行的话，只有System.exit(-1);
     *
     * @return
     */
    public int launch2() {
        try {
            System.out.println("run in try region");
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("run in catch region");
            return -1;
        } finally {
            System.out.println("run in finally region");
        }
    }


    public static class TestException {
        public TestException() {
        }

        boolean testEx() throws Exception {
            boolean ret = true;
            try {
                ret = testEx1();
                return ret;
            } catch (Exception e) {
                System.out.println("testEx, catch exception");
                ret = false;
                throw e;
            } finally {
                System.out.println("testEx, finally; return value=" + ret);
//                return ret;
            }
        }

        boolean testEx1() throws Exception {
            boolean ret = true;
            try {
                ret = testEx2();
                if (!ret) {
                    return false;
                }
                System.out.println("testEx1, at the end of try");
                return ret;
            } catch (Exception e) {
                System.out.println("testEx1, catch exception");
                ret = false;
                throw e;
            } finally {
                System.out.println("testEx1, finally; return value=" + ret);
//                return ret;
            }

        }

        boolean testEx2() throws Exception {
            boolean ret = true;
            try {
                int b = 12;
                int c;
                for (int i = 2; i >= -2; i--) {
                    c = b / i;
                    System.out.println("i=" + i);
                }
                return true;
            } catch (Exception e) {
                System.out.println("testEx2, catch exception");
//                ret = false;
                throw e;
            } finally {
                System.out.println("testEx2, finally; return value=" + ret);
                return ret;
            }
        }
    }

    public static void main(String[] args) {
        TryCatchFinally tryCatFin = new TryCatchFinally();
        TestException testException =new TryCatchFinally.TestException();
//        System.out.println(tryCatFin.launch());
//        System.out.println(tryCatFin.launch2());
        try {
            testException.testEx();
        } catch (Exception e) {
            System.out.println("outside");
            e.printStackTrace();
        }
    }
}
