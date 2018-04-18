package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_16;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 4:49
 **/

public class Run2 {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
