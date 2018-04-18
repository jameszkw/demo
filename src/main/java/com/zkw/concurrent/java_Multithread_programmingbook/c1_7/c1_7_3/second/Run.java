package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_3.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:38
 **/

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("end!");
    }
}
