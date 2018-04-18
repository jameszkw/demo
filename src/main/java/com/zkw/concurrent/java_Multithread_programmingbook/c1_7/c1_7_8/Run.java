package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_8;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 8:06
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
