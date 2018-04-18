package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:11
 **/

public class MyThreadSafe extends Thread {
    public static int count;
    //注意：一定要添加static关键字，这样synchronized与static锁的内容就是类了，因为count为static.
    synchronized private static void addCount(){
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
