package com.zkw.concurrent.synchronizedemo.synchronized_exception;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 2:04
 **/

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
