package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:52
 **/

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        try {
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
