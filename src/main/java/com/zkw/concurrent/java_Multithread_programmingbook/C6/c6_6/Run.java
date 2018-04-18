package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 7:42
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
