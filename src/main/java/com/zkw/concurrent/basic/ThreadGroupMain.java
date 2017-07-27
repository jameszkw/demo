package com.zkw.concurrent.basic;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class ThreadGroupMain implements Runnable {

    public void run() {
        String groupAndName=Thread.currentThread().getThreadGroup().getName()+"-"+Thread.currentThread().getName();
        while (true){
            System.out.println("I am "+groupAndName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("pringGroup");
        Thread t1=new Thread(tg,new ThreadGroupMain(),"t1");
        Thread t2=new Thread(tg,new ThreadGroupMain(),"t1");
        t1.start();
        t2.start();
        System.out.println(tg.activeCount());
        tg.list();

    }
}
