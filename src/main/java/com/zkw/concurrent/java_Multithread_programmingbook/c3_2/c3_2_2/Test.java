package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 10:00
 **/

public class Test {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
    }
}
