package com.zkw.concurrent.java_Multithread_programmingbook.c3_2.c3_2_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 7:56
 **/

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b){
            b.start();
            try {
                b.join();//说明join释放锁
//                Thread.sleep(6000);//Thead.sleep()不释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
