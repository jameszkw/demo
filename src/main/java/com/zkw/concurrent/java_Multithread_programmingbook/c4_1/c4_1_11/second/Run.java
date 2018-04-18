package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_11.second;

/**
 * hasWaiters(Condition conditon)的作用是查询是否有线程正在等待与此锁定有关的condition条件
 *
 * @author James
 * @create 2017-09-17 下午 8:06
 **/

public class Run {
    public static void main(String[] args) {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threads=new Thread[10];
        for (int i=0;i<10;i++){
            threads[i]=new Thread(runnable);
        }
        for (int i=0;i<10;i++){
            threads[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.notifyMethod();
    }
}
