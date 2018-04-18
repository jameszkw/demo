package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_4;

/**
 * 获取根线程组
 *
 * @author James
 * @create 2017-09-19 下午 9:44
 **/

public class Run {
    public static void main(String[] args) {
        System.out.println("线程："+Thread.currentThread().getName()+"所在的线程组名为："+Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程所在的线程组的父线程组的名称是："+Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："+Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
