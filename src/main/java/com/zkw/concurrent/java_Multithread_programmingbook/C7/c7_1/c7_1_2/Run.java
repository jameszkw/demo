package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_2;

/**
 * 验证TIMED_WAITING
 *
 * @author James
 * @create 2017-09-19 下午 8:14
 **/

public class Run {
    //NEW
    //RUNNABLE
    //BLOCKED
    //WAITING
    //TIMED_WAITING
    //TERMINATED
    public static void main(String[] args) {
        try {
            MyThread t=new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
