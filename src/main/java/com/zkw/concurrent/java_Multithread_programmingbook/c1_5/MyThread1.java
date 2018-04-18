package com.zkw.concurrent.java_Multithread_programmingbook.c1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:40
 **/

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("run threadName="+this.currentThread().getName()+" begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName="+this.currentThread().getName()+" end");
    }
}
