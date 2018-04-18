package com.zkw.concurrent.thread_interrupt.sleepexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 10:35
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
