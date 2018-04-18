package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_6;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:46
 **/

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
