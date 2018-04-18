package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_14;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 4:06
 **/

public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner=new OutClass.Inner();
        Thread t1=new Thread(new Runnable() {
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2=new Thread(new Runnable() {
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }
}
