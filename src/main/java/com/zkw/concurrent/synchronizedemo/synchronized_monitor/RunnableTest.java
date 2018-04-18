package com.zkw.concurrent.synchronizedemo.synchronized_monitor;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 下午 5:48
 **/

public class RunnableTest implements Runnable {
    private static boolean flag = true;

    public void run() {
        // 每个线程执行不同的方法
        if (flag) {
            flag = false;
            testSyncMethod();
        } else {
            flag = true;
            testSyncBlock();
        }
    }

    /**
     * 使用synchronized方法
     */
    private static synchronized void testSyncMethod() {// 注意static
        for (int i = 0; i < 100; i++) {
            System.out.println("testSyncMethod:" + i);
        }
    }

    /**
     * 使用synchronized代码块
     */
    private void testSyncBlock() {
        //-----------情况1
        /*synchronized (this){// 注意this
            for (int i = 0; i < 100; i++) {
                System.out.println("testSyncBlock:" + i);
            }
        }*/

        //-----------情况2
        synchronized (RunnableTest.class){// 注意this
            for (int i = 0; i < 100; i++) {
                System.out.println("testSyncBlock:" + i);
            }
        }
    }
    }
