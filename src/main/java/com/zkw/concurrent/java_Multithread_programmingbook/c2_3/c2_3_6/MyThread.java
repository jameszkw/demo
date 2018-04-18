package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:32
 **/

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
