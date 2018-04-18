package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_10.second;

import com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_10.ValueObject;

/**
 * 解决逻辑混乱的问题
 *
 * @author James
 * @create 2017-09-12 下午 8:26
 **/

public class SubtractResolve  extends Thread{
    private String lock;

    public SubtractResolve(String lock) {
        this.lock = lock;
    }

    public void subtract(){
        synchronized (lock){
            while (ValueObject.list.size()==0){
                System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end ThreadName="+Thread.currentThread().getName());
            }
            ValueObject.list.remove(0);
            System.out.println("list size="+ ValueObject.list.size());
        }
    }

    @Override
    public void run() {
        subtract();
    }
}
