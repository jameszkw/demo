package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:59
 **/

public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef=new MyService();
        msRef.addServicMethod(list,"B");
    }
}
