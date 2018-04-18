package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:56
 **/

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a","aa");
    }
}
