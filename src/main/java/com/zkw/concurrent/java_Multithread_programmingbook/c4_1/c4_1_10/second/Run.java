package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_10.second;

/**
 * getQueueLength()返回正等待获取此锁定的线程估计数
 *
 * @author James
 * @create 2017-09-17 下午 5:24
 **/

public class Run {
    public static void main(String[] args) {

        try {
            final Service service=new Service();
            Runnable runnable=new Runnable() {
                public void run() {
                    service.serviceMethod1();
                }
            };
            Thread[] threads=new Thread[10];
            for(int i=0;i<10;i++){
                threads[i]=new Thread(runnable);
            }
            for (int i=0;i<10;i++){
                threads[i].start();
            }
            Thread.sleep(2000);
            System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
