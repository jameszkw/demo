package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_10;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-11 下午 9:13
 **/

public class Add extends Thread{
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
            System.out.println("notifyAll end");
        }
    }

    @Override
    public void run() {
        add();
    }
}
