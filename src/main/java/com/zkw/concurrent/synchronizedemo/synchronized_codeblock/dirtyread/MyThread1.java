package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:58
 **/

public class MyThread1 extends Thread {
    private MyOneList list;

    public MyThread1(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef=new MyService();
        msRef.addServicMethod(list,"A");
    }
}
