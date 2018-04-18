package com.zkw.concurrent.synchronizedemo.synchronized_lockchange;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 5:56
 **/

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
