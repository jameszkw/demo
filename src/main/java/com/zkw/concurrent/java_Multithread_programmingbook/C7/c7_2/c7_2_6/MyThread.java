package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 9:53
 **/

public class MyThread extends Thread {
    public MyThread(ThreadGroup group,String name) {
        super(group,name);
    }

    @Override
    public void run() {
        System.out.println("threadname="+Thread.currentThread().getName()+"准备开始死循环了：");
        while (!this.isInterrupted()){

        }
        System.out.println("threadname="+Thread.currentThread().getName()+"结束了");
    }
}
