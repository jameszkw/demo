package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_5.second;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:06
 **/

public class Main3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程："+t.getName()+" 出现了异常：");
                e.printStackTrace();
            }
        });
        MyThread t1=new MyThread();
        t1.setName("线程t1");
        t1.start();
    }
}
