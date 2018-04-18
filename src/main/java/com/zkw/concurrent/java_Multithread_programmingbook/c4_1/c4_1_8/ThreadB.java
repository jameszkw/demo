package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_8;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 3:13
 **/

public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            myService.get();
        }
    }
}
