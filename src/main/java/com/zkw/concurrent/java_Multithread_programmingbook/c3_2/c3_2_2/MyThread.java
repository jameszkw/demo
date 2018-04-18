package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 9:59
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        int secondValue=(int)(Math.random()*10000);
        System.out.println(secondValue);
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
