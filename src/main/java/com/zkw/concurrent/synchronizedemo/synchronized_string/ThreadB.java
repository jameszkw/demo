package com.zkw.concurrent.synchronizedemo.synchronized_string;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 8:48
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
