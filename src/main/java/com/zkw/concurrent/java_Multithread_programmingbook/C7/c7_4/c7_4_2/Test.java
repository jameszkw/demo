package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_4.c7_4_2;


import java.text.SimpleDateFormat;

/**
 * 每个线程都创建一个对象解决SimpleDateFormat多线程问题
 *
 * @author James
 * @create 2017-09-26 下午 8:41
 **/

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray=new String[]{"2000-01-01","2000-01-02","2000-01-03","2000-01-04","2000-01-05","2000-01-06"};
        MyThread[] myThreads=new MyThread[6];
        for (int i=0;i<6;i++){
            myThreads[i]=new MyThread(sdf,dateStringArray[i]);
        }
        for (int i=0;i<6;i++){
            myThreads[i].start();
        }
    }
}
