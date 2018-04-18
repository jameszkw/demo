package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 3:13
 **/

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            myService.set();
        }
    }
}
