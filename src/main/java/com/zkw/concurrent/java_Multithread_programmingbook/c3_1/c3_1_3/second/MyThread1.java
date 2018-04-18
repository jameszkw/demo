package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:47
 **/

public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始    wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束    wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
