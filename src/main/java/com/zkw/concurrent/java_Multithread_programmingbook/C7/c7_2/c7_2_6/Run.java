package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_6;

/**
 * 组内的线程批量停止
 *
 * @author James
 * @create 2017-09-19 下午 9:55
 **/

public class Run{
    public static void main(String[] args) {
        try {
            ThreadGroup group=new ThreadGroup("我的线程组");
            for (int i=0;i<5;i++){
                MyThread myThread=new MyThread(group,"线程"+(i+1));
                myThread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("调用了interrupt()方法");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
