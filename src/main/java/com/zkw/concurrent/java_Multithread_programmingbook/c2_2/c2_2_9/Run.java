package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_9;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-08 下午 10:07
 **/

public class Run {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB();
        b.setName("B");
        b.start();

    }
}
