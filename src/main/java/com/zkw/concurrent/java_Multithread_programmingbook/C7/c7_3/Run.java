package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 10:17
 **/

public class Run {
    public static void main(String[] args) {
        Object lock=new Object();
        MyThread a=new MyThread(lock,"A",1);
        MyThread b=new MyThread(lock,"B",2);
        MyThread c=new MyThread(lock,"C",0);
        a.start();
        b.start();
        c.start();
    }
}
