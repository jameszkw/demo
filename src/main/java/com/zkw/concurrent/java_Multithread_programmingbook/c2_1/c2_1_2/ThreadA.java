package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_2;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 9:30
 **/

public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
