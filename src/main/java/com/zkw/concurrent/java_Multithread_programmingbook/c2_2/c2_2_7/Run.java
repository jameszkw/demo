package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:57
 **/

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
