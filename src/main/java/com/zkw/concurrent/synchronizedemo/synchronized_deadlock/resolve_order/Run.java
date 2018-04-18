package com.zkw.concurrent.synchronizedemo.synchronized_deadlock.resolve_order;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 上午 10:57
 **/

public class Run {
    public static void main(String[] args) {
        try {
            Resolve1 t1=new Resolve1();
            Thread thread1=new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            Thread thread2=new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
