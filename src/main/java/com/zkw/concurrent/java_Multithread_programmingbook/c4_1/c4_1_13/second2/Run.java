package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_13.second2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 8:41
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
        Thread threadB=new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
