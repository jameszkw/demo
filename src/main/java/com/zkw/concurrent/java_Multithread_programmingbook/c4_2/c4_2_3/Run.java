package com.zkw.concurrent.java_Multithread_programmingbook.c4_2.c4_2_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 8:39
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
