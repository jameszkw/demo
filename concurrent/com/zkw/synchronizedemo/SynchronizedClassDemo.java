package com.zkw.synchronizedemo;

/**
 * 使用Synchronized锁这个类对应的Class对象
 */
public class SynchronizedClassDemo {
    public void test(){
        synchronized(SynchronizedClassDemo.class){
            System.out.println("test开始..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test结束..");
        }
    }

    public static synchronized void test1(){
        System.out.println("test开始..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test结束..");
    }

    class MyThread extends Thread {
        public void run() {
            SynchronizedClassDemo sync = new SynchronizedClassDemo();
//            sync.test();
            SynchronizedClassDemo.test1();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new SynchronizedClassDemo().new MyThread();
            thread.start();
        }
    }
}
