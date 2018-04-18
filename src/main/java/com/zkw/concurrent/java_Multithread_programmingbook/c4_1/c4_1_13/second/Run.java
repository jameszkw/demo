package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_13.second;

/**
 * lockInterruptibly()如果当前线程未被中断，则获取锁定，如果已经被中断则出现异常
 *
 * @author James
 * @create 2017-09-17 下午 8:28
 **/

public class Run {
    public static void main(String[] args) {
        final MyService service=new MyService();
        Runnable runnable=new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA=new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB=new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();//打标记
        System.out.println("main end");
    }
}
