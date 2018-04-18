package com.zkw.concurrent.java_Multithread_programmingbook.c1_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:52
 **/

public class Test {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName()+" "+thread.getId());

        Thread1 thread1=new Thread1();
//        thread1.start();

        Thread thread2=new Thread(thread1);
        thread2.start();
    }
}
