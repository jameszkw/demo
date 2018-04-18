package com.zkw.concurrent.java_Multithread_programmingbook.c1_10.c1_10_1;

/**
 * 线程优先级具有继承性，比如A线程启动B线程，则B线程的优先级与A是一样的。
 *
 * @author James
 * @create 2017-09-10 下午 8:32
 **/

public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin prioriy="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());
        MyThread1 thread1=new MyThread1();
        thread1.start();

    }
}
