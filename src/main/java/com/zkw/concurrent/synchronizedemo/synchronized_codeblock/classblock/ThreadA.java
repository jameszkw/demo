package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.classblock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 4:28
 **/

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
