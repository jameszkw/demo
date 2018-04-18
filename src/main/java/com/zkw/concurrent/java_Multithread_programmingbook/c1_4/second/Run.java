package com.zkw.concurrent.java_Multithread_programmingbook.c1_4.second;

/**
 * Thread.currentThread()方法返回代码段正在被哪个线程调用的信息。
 * this.currentThread()与Thread.currentThread()相等。
 * this.getName()是自身的线程。
 * @author James
 * @create 2017-09-10 上午 10:31
 **/

public class Run {
    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t1=new Thread(c);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }
}
