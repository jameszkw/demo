package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_10.third;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 7:45
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
