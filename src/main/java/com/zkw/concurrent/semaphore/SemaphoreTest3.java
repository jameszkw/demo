package com.zkw.concurrent.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 我们一般使用信号量来限制访问资源的线程数量，比如有一个食堂，最多允许5个人同时吃饭
 *
 * @author James
 * @create 2018-02-09 上午 11:07
 **/

public class SemaphoreTest3 extends Thread{
    private Semaphore semaphore;

    public SemaphoreTest3(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();//获取一个许可，当然也可以调用acquire(int)，这样一个线程就能拿到多个许可
            long eatTime=(long) (Math.random()*10);
            System.out.println(Thread.currentThread().getId()+" 正在吃饭");
            TimeUnit.SECONDS.sleep(eatTime);
            System.out.println(Thread.currentThread().getId()+" 已经吃完");
            semaphore.release();//归还许可
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);//总共有5个许可
        for(int i=0;i<7;i++) {//定义七个吃的线程
            new SemaphoreTest3(semaphore).start();
        }
    }
}
