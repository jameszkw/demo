package com.zkw.concurrent.synchronizedemo;

/**
 * synchronized修饰方法的正确使用和错误使用
 */
public class SynchronizedMethodDemo {
    public synchronized void test(){
        System.out.println("test开始..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test结束..");
    }

    class WrongThread extends Thread{
        @Override
        public void run() {
            SynchronizedMethodDemo demo = new SynchronizedMethodDemo();
            demo.test();
        }
    }

    class RightThread extends Thread{
        SynchronizedMethodDemo demo;
        public RightThread(SynchronizedMethodDemo demo) {
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
            Thread thread = new SynchronizedMethodDemo().new WrongThread();
            thread.start();
        }
    }
    /**
     * 正确的使用synchronized修饰方法
     */
    private static void rightTest(){
        SynchronizedMethodDemo demo = new SynchronizedMethodDemo();
        for (int i = 0; i < 3; i++) {
            Thread thread = new SynchronizedMethodDemo().new RightThread(demo);
            thread.start();
        }
    }
    public static void main(String[] args) {
        wrongTest();
//        rightTest();
    }
}
