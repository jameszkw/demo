package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_5;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:19
 **/

public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
