package com.zkw.concurrent.java_Multithread_programmingbook.c4_2.c4_2_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 8:39
 **/

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
