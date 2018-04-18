package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 10:06
 **/

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
