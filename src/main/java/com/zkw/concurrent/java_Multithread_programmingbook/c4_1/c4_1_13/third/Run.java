package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_13.third;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:47
 **/

public class Run {
    public static void main(String[] args) {
        final MyService service=new MyService();
        Runnable runnable=new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName()+"调用waitMethod时间："+System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA=new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB=new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
