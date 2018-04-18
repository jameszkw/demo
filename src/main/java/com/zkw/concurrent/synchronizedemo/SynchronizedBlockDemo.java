package com.zkw.concurrent.synchronizedemo;

/**
 * synchronized修饰代码段的正确使用和错误使用
 */
public class SynchronizedBlockDemo {
    public void test(){
        synchronized(this){
            System.out.println("test开始..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test结束..");
        }
    }

    class WrongThread extends Thread{
        @Override
        public void run() {
            SynchronizedBlockDemo demo = new SynchronizedBlockDemo();
            demo.test();
        }
    }

    class RightThread extends Thread{
        SynchronizedBlockDemo demo;
        public RightThread(SynchronizedBlockDemo demo) {
            this.demo = demo;
        }

        @Override
        public void run() {
            demo.test();
        }
    }

    /**
     * 错误的使用synchronized修饰方法
     */
    private static void wrongTest(){
        for (int i = 0; i < 3; i++) {
            Thread thread = new SynchronizedBlockDemo().new WrongThread();
            thread.start();
        }
    }
    /**
     * 正确的使用synchronized修饰方法
     */
    private static void rightTest(){
        SynchronizedBlockDemo demo = new SynchronizedBlockDemo();
        for (int i = 0; i < 3; i++) {
            Thread thread = new SynchronizedBlockDemo().new RightThread(demo);
            thread.start();
        }
    }
    public static void main(String[] args) {
//        wrongTest();
        rightTest();
    }
}
