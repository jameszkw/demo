package com.zkw.concurrent.java_Multithread_designpattern.c1_1.systemexit;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 10:32
 **/

public class Target implements Runnable {
    public void run() {
        System.out.println("before");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
