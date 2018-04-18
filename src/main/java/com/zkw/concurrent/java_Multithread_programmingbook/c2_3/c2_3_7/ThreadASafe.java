package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:59
 **/

public class ThreadASafe extends Thread {
    private ServiceSafe service;

    public ThreadASafe(ServiceSafe service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
