package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-11 下午 8:08
 **/

public class ThreadA extends Thread {
    private Object lock;
    private Service service;

    public ThreadA(Object lock, Service service) {
        this.lock = lock;
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod(lock);
    }
}
