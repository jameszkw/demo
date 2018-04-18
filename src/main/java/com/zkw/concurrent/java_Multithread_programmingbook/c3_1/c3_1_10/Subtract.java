package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_10;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 8:00
 **/

public class Subtract extends Thread{
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract(){
        synchronized (lock){
            if (ValueObject.list.size()==0){
                System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end ThreadName="+Thread.currentThread().getName());
            }
            ValueObject.list.remove(0);
            System.out.println("list size="+ValueObject.list.size());
        }
    }

    @Override
    public void run() {
        subtract();
    }
}
