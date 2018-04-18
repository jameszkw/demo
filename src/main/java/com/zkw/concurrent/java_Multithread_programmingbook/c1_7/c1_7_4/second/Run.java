package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_4.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:56
 **/

public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("end!");
    }
}
