package com.zkw.concurrent.java_Multithread_programmingbook.c1_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:54
 **/

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("this.currentThread().getId="+this.currentThread().getId());
        System.out.println("this.getId="+this.getId());
        System.out.println("Thread.currentThread.getId="+Thread.currentThread().getId());
    }
}
