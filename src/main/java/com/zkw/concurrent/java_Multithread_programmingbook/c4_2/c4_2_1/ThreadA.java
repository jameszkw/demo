package com.zkw.concurrent.java_Multithread_programmingbook.c4_2.c4_2_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 8:39
 **/

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
