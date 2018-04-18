package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 8:18
 **/

public class MyThread2 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
