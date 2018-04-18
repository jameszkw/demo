package com.zkw.concurrent.java_Multithread_programmingbook.c1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:41
 **/

public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        System.out.println("begin="+System.currentTimeMillis());
        myThread1.run();
        System.out.println("end="+System.currentTimeMillis());
    }
}
