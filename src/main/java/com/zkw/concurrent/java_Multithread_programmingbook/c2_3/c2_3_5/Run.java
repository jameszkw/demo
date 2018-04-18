package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:29
 **/

public class Run {
    public static void main(String[] args) {
        AddCountThread countThread=new AddCountThread();
        Thread t1=new Thread(countThread);
        t1.start();
        Thread t2=new Thread(countThread);
        t2.start();
        Thread t3=new Thread(countThread);
        t3.start();
        Thread t4=new Thread(countThread);
        t4.start();
        Thread t5=new Thread(countThread);
        t5.start();
    }
}
