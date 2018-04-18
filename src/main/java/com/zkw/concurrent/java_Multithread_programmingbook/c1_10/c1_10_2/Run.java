package com.zkw.concurrent.java_Multithread_programmingbook.c1_10.c1_10_2;

/**
 * CPU尽量将执行资源让给优先级比较高的线程。
 *
 * @author James
 * @create 2017-09-10 下午 8:42
 **/

public class Run {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            MyThread1 thread1=new MyThread1();
            thread1.setPriority(Thread.MAX_PRIORITY);
            thread1.start();
            MyThread2 thread2=new MyThread2();
            thread2.setPriority(Thread.MIN_PRIORITY);
            thread2.start();
        }
    }
}
