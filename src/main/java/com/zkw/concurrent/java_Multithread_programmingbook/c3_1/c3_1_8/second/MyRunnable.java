package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_8.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-11 下午 8:55
 **/

public class MyRunnable {
    static private Object lock=new Object();
    static private Runnable runnable1=new Runnable() {
        public void run() {
            synchronized (lock){
                System.out.println("wait begin timer="+System.currentTimeMillis());
                try {
                    lock.wait();
//                    lock.wait(5000);
                    System.out.println("wait end timer="+System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    static private Runnable runnable2=new Runnable() {
        public void run() {
            synchronized (lock){
                System.out.println("notify begin timer="+System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end timer="+System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        Thread t1=new Thread(runnable1);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        Thread t2=new Thread(runnable2);
        t2.start();
    }
}
