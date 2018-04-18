package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 8:26
 **/

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b){
            System.out.println("begin A threadname="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end A threadname="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        }
    }
}
