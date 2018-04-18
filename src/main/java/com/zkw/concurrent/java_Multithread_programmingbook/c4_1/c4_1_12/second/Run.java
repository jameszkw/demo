package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_12.second;

/**
 * isHeldByCurrentThread()查询当前线程是否保持此锁定
 *
 * @author James
 * @create 2017-09-17 下午 8:19
 **/

public class Run {
    public static void main(String[] args) {
        final Service service1=new Service(true);
        Runnable runnable=new Runnable() {
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
