package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_12;

/**
 * isFair()判断是不是公平锁 默认情况下ReentrantLock使用的是非公平锁
 *
 * @author James
 * @create 2017-09-17 下午 8:13
 **/

public class Run {
    public static void main(String[] args) {
        final Service service=new Service(true);
        Runnable runnable=new Runnable() {
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        final Service service1=new Service(false);
        runnable=new Runnable() {
            public void run() {
                service1.serviceMethod();
            }
        };
        thread=new Thread(runnable);
        thread.start();
    }
}
