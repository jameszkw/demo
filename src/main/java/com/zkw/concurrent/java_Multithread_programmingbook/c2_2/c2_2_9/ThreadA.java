package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_9;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-08 下午 10:05
 **/

public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}
