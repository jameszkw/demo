package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_16;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 4:44
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
