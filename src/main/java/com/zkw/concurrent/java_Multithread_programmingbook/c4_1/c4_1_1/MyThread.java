package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:58
 **/

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
