package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_9;

/**
 * 如果先通知了，wait()方法永远不会接到通知。
 *
 * @author James
 * @create 2017-09-11 下午 9:02
 **/

public class MyRun {
    private String lock=new String("");
    private Runnable runnableA=new Runnable() {
        public void run() {
            synchronized (lock){
                System.out.println("begin wait");
                try {
                    lock.wait();
                    System.out.println("end wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
            }
        }
    };

    public static void main(String[] args) {
        MyRun run=new MyRun();
        Thread a=new Thread(run.runnableA);
        a.start();
        Thread b=new Thread(run.runnableB);
        b.start();
    }
}
