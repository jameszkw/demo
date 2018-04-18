package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-26 下午 9:11
 **/

public class Run {
    public static void main(String[] args) {
        ThreadGroup group=new ThreadGroup("我的线程组");
        MyThread[] myThreads=new MyThread[10];
        for (int i=0;i<myThreads.length;i++){
            myThreads[i]=new MyThread(group,"线程"+(i+1),"1");
            myThreads[i].start();
        }
        MyThread newT=new MyThread(group,"报错线程","a");
        newT.start();
    }
}
