package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 8:10
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread t=new MyThread();
            System.out.println("main方法中的状态1："+t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
