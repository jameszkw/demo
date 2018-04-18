package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 8:27
 **/

public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        System.out.println("begin B threadname="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end B threadname="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
    }
}
