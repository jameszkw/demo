package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 8:34
 **/

public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
