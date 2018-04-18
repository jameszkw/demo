package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7.dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 9:28
 **/

public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef=new MyService();
        msRef.addServiceMethod(list,"B");
    }
}
