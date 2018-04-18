package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-14 下午 9:16
 **/

public class Run {
    public static void main(String[] args) {
        MyService service =new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa=new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb=new ThreadBB(service);
        bb.setName("BB");
        bb.start();
    }
}
