package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_4;

/**
 * 验证WAITING
 *
 * @author James
 * @create 2017-09-19 下午 8:25
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread t=new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t状态："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
