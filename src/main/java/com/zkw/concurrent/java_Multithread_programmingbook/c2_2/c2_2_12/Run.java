package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_12;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 3:35
 **/

public class Run {
    public static void main(String[] args) {
        DeadThread t1=new DeadThread();
        t1.setFalg("a");
        Thread thread1=new Thread(t1);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setFalg("b");
        Thread thread2=new Thread(t1);
        thread2.start();
    }
}
