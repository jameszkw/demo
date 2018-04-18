package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_9.second;

/**
 * 解决通知不到的问题。
 *
 * @author James
 * @create 2017-09-11 下午 9:06
 **/

public class MyRun {
    private String lock=new String();
    private boolean isFirstRunB=false;
    private Runnable runnableA=new Runnable() {
        public void run() {
            synchronized (lock){
                while (isFirstRunB==false){
                    System.out.printf("begin wait");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("end wait");
                }
            }
        }
    };

    private Runnable runnableB=new Runnable() {
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB=true;
            }
        }
    };

    public static void main(String[] args) {
        MyRun run=new MyRun();

        Thread a=new Thread(run.runnableA);
        a.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread b=new Thread(run.runnableB);
        b.start();
    }
}
