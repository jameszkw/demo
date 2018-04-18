package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 7:56
 **/

public class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println(" b run begin timer="+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b run end timer="+System.currentTimeMillis());
    }

    synchronized public void bService(){
        System.out.println("打印了bService timer="+System.currentTimeMillis());
    }
}
