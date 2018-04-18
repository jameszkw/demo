package com.zkw.concurrent.thread_interrupt.sleepexample.demo1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 10:49
 **/

public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
