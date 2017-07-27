package com.zkw.concurrent.basic;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class GoodSuspend {
    public static Object u=new Object();

    public static class ChangeObjectThread extends Thread{
        volatile boolean suspendme=false;

        public void suspendme() {
            suspendme=true;
        }

        public void resumeMe(){
            suspendme=false;
            synchronized (this){
                notify();
            }
        }

        @Override
        public void run() {
            while (true){
                synchronized (this){
                    while (suspendme){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                synchronized (u){
                    System.out.println("in changeobjectThread");
                }
                Thread.yield();
            }
        }
    }

    public static class ReadObjectThread extends Thread{
        @Override
        public void run() {
            while (true){
                synchronized (u){
                    System.out.println("in readobjectThread");
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        ChangeObjectThread t1 = new ChangeObjectThread();
        ReadObjectThread t2=new ReadObjectThread();
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.suspendme();
        System.out.println("suspend t1 2 sec");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("resume t1");
        t1.resumeMe();
    }
}
