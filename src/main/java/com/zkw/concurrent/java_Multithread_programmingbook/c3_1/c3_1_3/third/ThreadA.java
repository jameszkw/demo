package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.third;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:55
 **/

public class ThreadA extends Thread{
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            if (MyList.size()!=5){
                System.out.println("wait begin "+System.currentTimeMillis());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end"+System.currentTimeMillis());
            }
        }
    }
}
