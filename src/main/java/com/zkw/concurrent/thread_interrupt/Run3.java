package com.zkw.concurrent.thread_interrupt;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 5:51
 **/

public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("\n是否停止1？="+thread.isInterrupted());
            System.out.println("\n是否停止2？="+thread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
