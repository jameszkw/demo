package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 11:13
 **/

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        try {
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1? ="+thread.isInterrupted());
            System.out.println("是否停止2? ="+thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
}
}
