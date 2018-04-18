package com.zkw.concurrent.synchronizedemo.justest;

/**
 * 当一个线程访问对象的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该对象中的非synchronized(this)同步代码块
 *
 * @author James
 * @create 2017-09-05 下午 4:02
 **/

public class Counter implements Runnable {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void countAdd(){
        synchronized (this){
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+":"+(count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //非synchronized代码块，未对count进行读写操作，所以可以不用synchronized
    public void printCount(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"count:"+count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")){
            countAdd();
        } else if(threadName.equals("B")){
            printCount();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter,"A");
        Thread thread2 = new Thread(counter,"B");
        thread1.start();
        thread2.start();
    }
}
