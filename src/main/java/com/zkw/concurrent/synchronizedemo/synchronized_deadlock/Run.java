package com.zkw.concurrent.synchronizedemo.synchronized_deadlock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 上午 10:57
 **/

public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1=new DealThread();
            t1.setFlag("a");
            Thread thread1=new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2=new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
