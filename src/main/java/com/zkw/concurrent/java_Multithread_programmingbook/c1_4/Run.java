package com.zkw.concurrent.java_Multithread_programmingbook.c1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 8:34
 **/

public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        System.out.println("begin=="+myThread.isAlive());
        myThread.start();
        System.out.println("end=="+myThread.isAlive());
    }
}
