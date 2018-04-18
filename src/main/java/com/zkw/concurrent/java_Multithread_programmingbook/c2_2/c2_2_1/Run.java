package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_1;

/**
 * synchronized修饰方法运行时间长
 *
 * @author James
 * @create 2017-09-07 下午 7:59
 **/

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1=new MyThread1(task);
        thread1.start();
        MyThread2 thread2=new MyThread2(task);
        thread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime=CommonUtils.beginTime1;
        if (CommonUtils.beginTime2<CommonUtils.beginTime1){
            beginTime=CommonUtils.beginTime2;
        }
        long endTime=CommonUtils.endTime1;
        if (CommonUtils.endTime2>CommonUtils.endTime1){
            endTime=CommonUtils.endTime2;
        }
        System.out.println("耗时："+(endTime-beginTime)/1000);
    }
}
