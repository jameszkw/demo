package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_11;

/**
 * hasQueuedThread(Thread thread)是查询指定的线程是否正在等待获取此锁定
 * hasQueuedThreads()查询是否有线程正在等待获取此锁定
 * @author James
 * @create 2017-09-17 下午 7:57
 **/

public class Run {
    public static void main(String[] args) {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA=new Thread(runnable);
        threadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB=new Thread(runnable);
        threadB.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
