package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_3.second;


/**
 * JVM中加-server参数会解决死循环问题，因为volatile关键字，线程直接从主内存中获取isRunning
 *
 * @author James
 * @create 2017-09-09 下午 6:41
 **/

public class Run {
    public static void main(String[] args) {
        RunThread thread=new RunThread();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setRunning(false);
        System.out.println("已经赋值为false");

    }
}
