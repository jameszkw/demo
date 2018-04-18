package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:09
 **/

public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group,String name,String num) {
        super(group,name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt=Integer.parseInt(num);
        while (true){
            System.out.println("死循环中："+Thread.currentThread().getName());
        }
    }
}
