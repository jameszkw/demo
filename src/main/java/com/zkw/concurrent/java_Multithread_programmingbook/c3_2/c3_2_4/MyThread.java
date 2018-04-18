package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 7:48
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("begin timer="+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
