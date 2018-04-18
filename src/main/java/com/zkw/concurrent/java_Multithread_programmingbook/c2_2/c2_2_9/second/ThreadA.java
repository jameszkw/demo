package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_9.second;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-08 下午 10:05
 **/

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printA();
    }
}
