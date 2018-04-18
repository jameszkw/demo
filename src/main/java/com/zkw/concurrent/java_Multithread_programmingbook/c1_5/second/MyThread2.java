package com.zkw.concurrent.java_Multithread_programmingbook.c1_5.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:43
 **/

public class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("run threadName="+this.currentThread().getName()+" begin="+System.currentTimeMillis());
        System.out.println("run threadName="+Thread.currentThread().getName()+" begin="+System.currentTimeMillis());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName="+this.currentThread().getName()+" end="+System.currentTimeMillis());
    }
}
