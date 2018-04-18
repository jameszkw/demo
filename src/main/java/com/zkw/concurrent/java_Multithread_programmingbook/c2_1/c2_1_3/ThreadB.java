package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_3;



/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 9:36
 **/

public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
