package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:33
 **/

public class Run {

    private void start(){
        MyService service=new MyService();
        MyThread[] threads=new MyThread[5];
        for (int i=0;i<threads.length;i++){
            threads[i]=new MyThread(service);
        }
        for (int i=0;i<threads.length;i++){
            threads[i].start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.aiRef.get());
    }

    private static void startSafe(){
        MyServiceSafe service=new MyServiceSafe();
        MyThreadSafe[] threads=new MyThreadSafe[5];
        for (int i=0;i<threads.length;i++){
            threads[i]=new MyThreadSafe(service);
        }
        for (int i=0;i<threads.length;i++){
            threads[i].start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(service.aiRef.get());
        System.out.println(service.count);
    }
    public static void main(String[] args) {
        startSafe();
    }
}
