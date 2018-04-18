package com.zkw.concurrent.java_Multithread_programmingbook.c1_4.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 10:28
 **/

public class CountOperate extends Thread{
    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.currentThread().getName()="+this.currentThread().getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("run---end");
    }
}
