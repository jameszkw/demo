package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:25
 **/

public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.start();
    }
}
