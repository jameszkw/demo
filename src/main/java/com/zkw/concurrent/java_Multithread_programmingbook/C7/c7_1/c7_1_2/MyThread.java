package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 8:13
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
