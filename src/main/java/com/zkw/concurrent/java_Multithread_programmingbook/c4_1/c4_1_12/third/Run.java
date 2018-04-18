package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_12.third;

/**
 * isLocked()是查询此锁定是否由任意线程保持
 *
 * @author James
 * @create 2017-09-17 下午 8:22
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
    }
}
