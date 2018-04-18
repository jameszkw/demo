package com.zkw.concurrent.synchronizedemo.synchronized_exception;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 2:05
 **/

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
