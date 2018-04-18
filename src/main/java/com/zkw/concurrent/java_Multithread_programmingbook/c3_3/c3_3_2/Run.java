package com.zkw.concurrent.java_Multithread_programmingbook.c3_3.c3_3_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 8:59
 **/

public class Run {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        a.start();
        try {
            Thread.sleep(1000);
            ThreadB b=new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
