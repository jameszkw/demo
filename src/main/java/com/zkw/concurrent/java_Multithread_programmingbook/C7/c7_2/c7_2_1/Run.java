package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_1;

/**
 * 线程组 1级关联
 *
 * @author James
 * @create 2017-09-19 下午 9:22
 **/

public class Run {
    public static void main(String[] args) {
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();
        ThreadGroup group=new ThreadGroup("test线程组");
        Thread a=new Thread(group,threadA);
        Thread b=new Thread(group,threadB);
        a.start();
        b.start();
        System.out.println("活动的线程数为："+group.activeCount());
        System.out.println("线程组名称为："+group.getName());
    }
}
