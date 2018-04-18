package com.zkw.concurrent.synchronizedemo.justest;

/**
 * 一个线程访问一个对象中的synchronized(this)同步代码块时，其他试图访问该对象的线程将被阻塞
 *
 * @author James
 * @create 2017-09-05 下午 3:52
 **/

public class SyncThread implements Runnable {
    private static int count;

    public SyncThread() {
        count = 0;
    }

    public void run() {
        synchronized (this){
            for (int i = 0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+":"+(count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        Thread thread1= new Thread(syncThread,"thread1");
        Thread thread2 = new Thread(syncThread,"thread2");
        thread1.start();
        thread2.start();
    }
}
