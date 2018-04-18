package com.zkw.concurrent.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class SemaphoreTest2 {
    Semaphore binary=new Semaphore(2);

    public static void main(String[] args) {
        final SemaphoreTest2 test2=new SemaphoreTest2();
        new Thread(){
            @Override
            public void run() {
                test2.mutualExclusion();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                test2.mutualExclusion();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                test2.mutualExclusion();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                test2.mutualExclusion();
            }
        }.start();
    }

    private void mutualExclusion(){
        try {
//            binary.acquire();
            binary.acquireUninterruptibly();
            binary.tryAcquire(2);//
            System.out.println(Thread.currentThread().getName()+" inside mutual exclusive region");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            binary.release();
            System.out.println(Thread.currentThread().getName()+" outside mutual exclusive region");
        }

    }
}
