package com.zkw.concurrent.thread_interrupt;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 5:01
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("\n是否停止1？="+thread.interrupted());
            System.out.println("\n是否停止2？="+thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
