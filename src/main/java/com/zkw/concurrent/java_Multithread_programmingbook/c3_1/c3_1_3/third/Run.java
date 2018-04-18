package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.third;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 10:01
 **/

public class Run {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB b=new ThreadB(lock);
        b.start();
    }
}
