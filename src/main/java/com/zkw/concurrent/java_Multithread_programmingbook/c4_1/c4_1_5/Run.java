package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:47
 **/

public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.singalAll();
    }
}
