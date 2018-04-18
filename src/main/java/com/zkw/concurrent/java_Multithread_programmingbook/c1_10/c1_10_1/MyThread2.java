package com.zkw.concurrent.java_Multithread_programmingbook.c1_10.c1_10_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 8:31
 **/

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}
