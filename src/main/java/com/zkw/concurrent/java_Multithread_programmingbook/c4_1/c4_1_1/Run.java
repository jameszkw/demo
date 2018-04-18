package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:58
 **/

public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        MyThread a1=new MyThread(service);
        MyThread a2=new MyThread(service);
        MyThread a3=new MyThread(service);
        MyThread a4=new MyThread(service);
        MyThread a5=new MyThread(service);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
