package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7.dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 9:32
 **/

public class Run {
    public static void main(String[] args) {
        MyOneList list=new MyOneList();
        MyThread1 t1=new MyThread1(list);
        t1.setName("A");
        t1.start();
        MyThread2 t2=new MyThread2(list);
        t2.setName("B");
        t2.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("listSize="+list.getSize());
    }
}
