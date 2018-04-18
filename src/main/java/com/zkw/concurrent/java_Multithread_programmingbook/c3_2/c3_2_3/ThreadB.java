package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 10:06
 **/

public class ThreadB extends Thread {
    @Override
    public void run() {
        ThreadA a=new ThreadA();
        a.start();
        try {
            a.join();
            System.out.println("线程b在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程b在catch处打印了");
            e.printStackTrace();
        }
    }
}
