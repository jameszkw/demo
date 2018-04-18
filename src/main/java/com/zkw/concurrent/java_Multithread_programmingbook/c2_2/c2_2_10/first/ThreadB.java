package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_10.first;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 2:11
 **/

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
    }
}
