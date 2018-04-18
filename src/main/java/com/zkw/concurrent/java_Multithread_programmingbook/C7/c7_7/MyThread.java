package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:41
 **/

public class MyThread extends Thread {
    private String num="a";

    public MyThread() {
    }

    public MyThread(ThreadGroup group,String name) {
        super(group,name);
    }

    @Override
    public void run() {
        int numInt=Integer.parseInt(num);
        System.out.println("在线程中打印："+(numInt+1));
    }
}
