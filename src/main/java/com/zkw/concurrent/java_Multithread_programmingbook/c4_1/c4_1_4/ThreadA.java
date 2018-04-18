package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:35
 **/

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
