package com.zkw.concurrent.thread_interrupt.returnexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 上午 9:59
 **/

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
