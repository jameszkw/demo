package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 10:02
 **/

public class MyObject {
    synchronized public void methodA(){
        System.out.println("begin methodA threadName="+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   synchronized public void methodB(){
        System.out.println("begin methodB threadName="+Thread.currentThread().getName()+" begin time="+System.currentTimeMillis());
        System.out.println("end");
    }
}
