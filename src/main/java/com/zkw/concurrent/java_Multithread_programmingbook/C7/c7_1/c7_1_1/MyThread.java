package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_1;

/**
 * 验证NEW,RUNNABLE,TERMINATED
 *
 * @author James
 * @create 2017-09-19 下午 8:08
 **/

public class MyThread extends Thread{
    public MyThread() {
        System.out.println("构造方法中的状态"+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态："+Thread.currentThread().getState());
    }
}
