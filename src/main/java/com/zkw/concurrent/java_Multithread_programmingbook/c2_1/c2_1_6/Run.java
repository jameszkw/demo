package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6;

/**
 * synchronized 重入锁
 *
 * @author James
 * @create 2017-09-06 下午 9:30
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
