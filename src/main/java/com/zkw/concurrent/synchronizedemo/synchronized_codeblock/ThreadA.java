package com.zkw.concurrent.synchronizedemo.synchronized_codeblock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 2:56
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
