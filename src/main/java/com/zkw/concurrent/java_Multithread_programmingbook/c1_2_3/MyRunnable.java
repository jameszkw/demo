package com.zkw.concurrent.java_Multithread_programmingbook.c1_2_3;

/**
 * 实例变量针对其他线程的不共享数据“count”
 *
 * @author James
 * @create 2017-09-04 下午 10:01
 **/

public class MyRunnable implements Runnable {
    private int count = 5;
    public void run() {
        while (count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算.count="+count);
        }
    }

    public static void main(String[] args) {
        Thread a = new Thread(new MyRunnable(),"A");
        Thread b = new Thread(new MyRunnable(),"B");
        Thread c = new Thread(new MyRunnable(),"C");
        a.start();
        b.start();
        c.start();
    }
}
