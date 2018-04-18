package com.zkw.concurrent.java_Multithread_programmingbook.c1_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 8:34
 **/

public class Run1 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        System.out.println("begin=="+myThread.isAlive());
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end=="+myThread.isAlive());
    }
}
