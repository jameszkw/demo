package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:50
 **/

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("开始notify time="+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify time="+System.currentTimeMillis());
        }
    }
}
