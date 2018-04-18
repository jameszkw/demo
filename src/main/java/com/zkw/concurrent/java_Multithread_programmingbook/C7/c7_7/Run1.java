package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:47
 **/

public class Run1 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        //对象
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();

    }
}
