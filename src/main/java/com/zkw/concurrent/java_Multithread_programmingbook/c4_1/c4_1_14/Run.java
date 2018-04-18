package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_14;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:52
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        MyThread myThread=new MyThread(service);
        myThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}
