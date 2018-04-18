package com.zkw.concurrent.thread_status;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 3:00
 **/

public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        System.out.println("begin=="+myThread.isAlive());
        myThread.start();
        System.out.println("end=="+myThread.isAlive());

    }
}
