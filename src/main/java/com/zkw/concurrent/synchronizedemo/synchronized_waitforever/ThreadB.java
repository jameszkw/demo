package com.zkw.concurrent.synchronizedemo.synchronized_waitforever;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 上午 9:45
 **/

public class ThreadB extends java.lang.Thread{
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
