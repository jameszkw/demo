package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 8:24
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            synchronized (Lock.lock){
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
