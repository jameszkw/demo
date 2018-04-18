package com.zkw.concurrent.synchronizedemo.synchronized_string;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 8:47
 **/

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
    }
}
