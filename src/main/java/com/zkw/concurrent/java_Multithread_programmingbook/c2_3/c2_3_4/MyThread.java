package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_4;

/**
 * addCount()非线程安全。
 *
 * @author James
 * @create 2017-09-09 下午 7:03
 **/

public class MyThread extends Thread {
    volatile public static int count;
    private static void addCount(){
        for (int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
