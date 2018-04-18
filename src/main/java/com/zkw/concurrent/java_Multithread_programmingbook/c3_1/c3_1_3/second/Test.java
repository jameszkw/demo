package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:52
 **/

public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        MyThread1 t1=new MyThread1(lock);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 t2=new MyThread2(lock);
        t2.start();
    }
}
