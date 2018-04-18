package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_15;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 9:08
 **/

public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
