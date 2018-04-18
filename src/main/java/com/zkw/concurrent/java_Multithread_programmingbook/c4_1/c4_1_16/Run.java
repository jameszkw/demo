package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用condition对象可以对线程执行的业务进行排序规划
 *
 * @author James
 * @create 2017-09-18 下午 8:15
 **/

public class Run {
    volatile private static int nextPrintWho=1;
    private static ReentrantLock lock=new ReentrantLock();
    final private static Condition conditionA=lock.newCondition();
    final private static Condition conditionB=lock.newCondition();
    final private static Condition conditionC=lock.newCondition();

    public static void main(String[] args) {
        Thread threadA=new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho!=1){
                        conditionA.await();
                    }
                    for (int i=0;i<3;i++){
                        System.out.println("threadA"+(i+1));
                    }
                    nextPrintWho=2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadB=new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho!=2){
                        conditionB.await();
                    }
                    for (int i=0;i<3;i++){
                        System.out.println("threadB"+(i+1));
                    }
                    nextPrintWho=3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadC=new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho!=3){
                        conditionC.await();
                    }
                    for (int i=0;i<3;i++){
                        System.out.println("threadC"+(i+1));
                    }
                    nextPrintWho=1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        };

        Thread[] threadsA=new Thread[5];
        Thread[] threadsB=new Thread[5];
        Thread[] threadsC=new Thread[5];
        for (int i=0;i<5;i++){
            threadsA[i]=new Thread(threadA);
            threadsB[i]=new Thread(threadB);
            threadsC[i]=new Thread(threadC);
            threadsA[i].start();
            threadsB[i].start();
            threadsC[i].start();
        }
    }

}
