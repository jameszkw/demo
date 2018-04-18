package com.zkw.concurrent.java_Multithread_programmingbook.c1_10.c1_10_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 8:30
 **/

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread2=new MyThread2();
        thread2.start();
    }
}
