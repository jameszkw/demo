package com.zkw.concurrent.thread_interrupt.forexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 6:04
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread2 myThread=new MyThread2();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
