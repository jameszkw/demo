package com.zkw.concurrent.java_Multithread_programmingbook.c1_5.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:44
 **/

public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2=new MyThread2();
        System.out.println("begin="+System.currentTimeMillis());
        myThread2.start();
        System.out.println("end="+System.currentTimeMillis());

    }
}
