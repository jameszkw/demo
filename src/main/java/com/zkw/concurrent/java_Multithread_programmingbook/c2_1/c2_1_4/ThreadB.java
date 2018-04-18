package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 10:05
 **/

public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
