package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 10:08
 **/

public class Run {
    public static void main(String[] args) {
        ThreadB b=new ThreadB();
        b.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadC c=new ThreadC(b);
        c.start();
    }
}
