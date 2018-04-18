package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2;

/**
 * 延迟加载 在多线程情况下就是错误的，不能实现单例的状态
 *
 * @author James
 * @create 2017-09-18 下午 9:19
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
