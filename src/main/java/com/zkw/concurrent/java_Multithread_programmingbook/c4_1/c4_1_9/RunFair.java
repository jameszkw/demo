package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_9;

/**
 * 公平锁基本是有序的
 * 当为false为非公平锁时基本是乱序的
 * @author James
 * @create 2017-09-17 下午 4:32
 **/

public class RunFair {
    public static void main(String[] args) {
        final Service service=new Service(true);
        Runnable runnable=new Runnable() {
            public void run() {
                System.out.println("=线程"+Thread.currentThread().getName()+"运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads=new Thread[10];
        for (int i=0;i<10;i++){
            threads[i]=new Thread(runnable);
        }
        for (int i=0;i<10;i++){
            threads[i].start();
        }
    }
}
