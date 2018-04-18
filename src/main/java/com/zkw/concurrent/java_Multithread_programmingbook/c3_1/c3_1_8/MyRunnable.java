package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_8;

import com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.third.ThreadA;

/**
 * 注：说是超过wait(timeout)的timeout时间后自动唤醒，可是不是这样的。
 *
 * @author James
 * @create 2017-09-11 下午 8:36
 **/

public class MyRunnable {
    static private Object lock=new Object();
    static private Runnable runnable1=new Runnable() {
        public void run() {
            try {

                synchronized (lock){
                    System.out.println("wait begin timer="+System.currentTimeMillis());
                    lock.wait(0);
                    System.out.println("wait end timer="+System.currentTimeMillis());
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t=new ThreadA(runnable1);
        t.start();
    }
}
