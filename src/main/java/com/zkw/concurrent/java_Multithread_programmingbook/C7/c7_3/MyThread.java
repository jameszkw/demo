package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_3;

/**
 * 默认情况下，线程在运行时多个线程之间执行任务的时机是无序的。
 * 通过以下使他们有序
 *
 * @author James
 * @create 2017-09-19 下午 10:11
 **/

public class MyThread extends Thread {
    private Object lock;
    private String showChar;
    private int showNumPosition;
    private int printCount=0;//统计打印了几个字母

    volatile private static int addNumber=1;

    public MyThread(Object lock,String showChar,int showNumPosition) {
        super();
        this.lock=lock;
        this.showChar=showChar;
        this.showNumPosition=showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                while (true){
                    if (addNumber%3==showNumPosition){
                        System.out.println("threadname="+Thread.currentThread().getName()+" runCount="+addNumber+" "+showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (printCount==3){
                            break;
                        }
                    }else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
