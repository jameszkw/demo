package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_7;


/**
 * 6.6将枚举类暴露了，违反了“职责单一原则”
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
