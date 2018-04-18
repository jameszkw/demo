package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 7:59
 **/

public class ThreadC extends Thread {
    private ThreadB b;

    public ThreadC(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }

}
