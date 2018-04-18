package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:04
 **/

public class Run {
    private static void startMyThreadSafe(){
        MyThreadSafe[] myThreads=new MyThreadSafe[100];
        for (int i=0;i<100;i++){
            myThreads[i]=new MyThreadSafe();
        }
        for (int i=0;i<100;i++){
            myThreads[i].start();
        }
    }

    private void startMyThread(){
        MyThread[] myThreads=new MyThread[100];
        for (int i=0;i<100;i++){
            myThreads[i]=new MyThread();
        }
        for (int i=0;i<100;i++){
            myThreads[i].start();
        }
    }
    public static void main(String[] args) {
        startMyThreadSafe();
    }
}
