package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_1.c7_1_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 8:20
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread1 t1=new MyThread1();
            t1.setName("a");
            t1.start();
            MyThread2 t2=new MyThread2();
            t2.setName("b");
            t2.start();
            Thread.sleep(100);
            System.out.println("mian方法中的t2状态："+t2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
