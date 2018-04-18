package com.zkw.concurrent.synchronizedemo.synchronized_codeblock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 2:57
 **/

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b","bb");
    }
}
