package com.zkw.concurrent.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 死锁用信号量(semasphore)来模拟,通过非owner的线程来实现死锁的恢复，如下程序。但如果使用Lock则做不到，因为要使用Lock.unlock()来释放锁
 * 首先需要得到这个锁对象。而semasphore不需要得到锁对象，且semasphore也是模拟的互斥排他锁与其他锁并不同。
 *
 * @author James
 * @create 2018-02-09 下午 2:24
 **/

public class SemasphoreTest4 extends Thread {

    static class WorkThread2 extends Thread {
        private Semaphore semaphore1, semaphore2;

        public WorkThread2(Semaphore semaphore1, Semaphore semaphore2) {
            this.semaphore1 = semaphore1;
            this.semaphore2 = semaphore2;
        }

        public void releaseSemaphore2() {
            System.out.println(Thread.currentThread().getId() + " 释放Semaphore2");
            semaphore2.release();
        }

        @Override
        public void run() {
            try {
                semaphore1.acquire(); //先获取Semaphore1
                System.out.println(Thread.currentThread().getId() + " 获得Semaphore1");
                TimeUnit.SECONDS.sleep(5); //等待5秒让WorkThread1先获得Semaphore2
                semaphore2.acquire();//获取Semaphore2
                System.out.println(Thread.currentThread().getId() + " 获得Semaphore2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class WorkThread1 extends Thread {
        private Semaphore semaphore1, semaphore2;

        public WorkThread1(Semaphore semaphore1, Semaphore semaphore2) {
            this.semaphore1 = semaphore1;
            this.semaphore2 = semaphore2;
        }

        @Override
        public void run() {
            try {
                semaphore2.acquire();//先获取Semaphore2
                System.out.println(Thread.currentThread().getId() + " 获得Semaphore2");
                TimeUnit.SECONDS.sleep(5);//等待5秒，让WorkThread1先获得Semaphore1
                semaphore1.acquire();//获取Semaphore1
                System.out.println(Thread.currentThread().getId() + " 获得Semaphore1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Semaphore semaphore1 = new Semaphore(1);
        Semaphore semaphore2 = new Semaphore(1);
        new WorkThread1(semaphore1, semaphore2).start();
        new WorkThread2(semaphore1, semaphore2).start();
        //此时已经陷入了死锁，WorkThread1持有semaphore1的许可，请求semaphore2的许可 WorkThread2持有semaphore2的许可，请求semaphore1的许可
        try {
            TimeUnit.SECONDS.sleep(10);
            //在主线程添加semaphore1,semaphore2的释放,解决死锁问题
            semaphore1.release();
            semaphore2.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
