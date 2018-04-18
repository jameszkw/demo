package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_9.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-08 下午 10:09
 **/

public class Service {
    synchronized public static void printA(){
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
    }
    synchronized public static void printB(){
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");
    }
    synchronized public void printC(){
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printC");
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printC");
    }
}
