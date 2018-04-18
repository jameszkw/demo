package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 9:21
 **/

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("threadname="+Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
