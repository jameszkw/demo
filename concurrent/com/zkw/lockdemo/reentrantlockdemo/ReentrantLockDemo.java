package com.zkw.lockdemo.reentrantlockdemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class ReentrantLockDemo {
    private ReentrantLock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): " + captured);
        } finally {
            if (captured)
                lock.unlock();
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("tryLock(2, TimeUnit.SECONDS): " + captured);
        } finally {
            if (captured)
                lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        final ReentrantLockDemo demo = new ReentrantLockDemo();
        demo.untimed(); // True -- 可以成功获得锁
        demo.timed(); // True --可以成功获得锁
        //新创建一个线程获得锁并且不释放
        new Thread() {
            {
                setDaemon(true);
            }

            @Override
            public void run() {
                demo.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.sleep(100);// 保证新线程能够先执行
        demo.untimed(); // False -- 马上中断放弃
        demo.timed(); // False -- 等两秒超时后中断放弃
    }
}
