package com.zkw.concurrent.java_Multithread_programmingbook.c1_9;

/**
 * yield()方法的作用是放弃当前的CPU资源，让给其他任务去占用CPU.但放弃的时间不确定，有可能刚刚放弃，马上又获得CPU时间片。
 *
 * @author James
 * @create 2017-09-10 下午 8:17
 **/

public class MyThead extends Thread {
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        int count=0;
        for (int i=0;i<500000;i++){
//            Thread.yield();
            count=count+(i+1);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒！");
    }
}
