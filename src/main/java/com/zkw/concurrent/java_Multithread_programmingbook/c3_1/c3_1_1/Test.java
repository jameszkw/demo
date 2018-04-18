package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:25
 **/

public class Test {
    public static void main(String[] args) {
        MyList service=new MyList();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
