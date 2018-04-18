package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_8;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 10:01
 **/

public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }
}
