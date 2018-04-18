package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 10:08
 **/

public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
