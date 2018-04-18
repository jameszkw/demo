package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_5;

/**
 * 线程组里加线程组
 *
 * @author James
 * @create 2017-09-19 下午 9:48
 **/

public class Run {
    public static void main(String[] args) {
        System.out.println("线程组名称："+Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量："+Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程组的数量-加之前："+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group=new ThreadGroup(Thread.currentThread().getThreadGroup(),"newGroup");
        System.out.println("线程组中线程组的数量-加之后："+Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称："+Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
