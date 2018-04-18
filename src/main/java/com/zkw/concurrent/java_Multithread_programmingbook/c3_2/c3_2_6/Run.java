package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 8:30
 **/

public class Run {


    public static void main(String[] args) {
        ThreadB b=new ThreadB();
        ThreadA a=new ThreadA(b);
        a.start();
        b.start();
        try {
            b.join(5000);
            System.out.println(" main end"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
