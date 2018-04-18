package com.zkw.concurrent.java_Multithread_programmingbook.c1_2_3;

/**
 * 共享数据的情况。
 *
 * @author James
 * @create 2017-09-04 下午 10:06
 **/

public class MyThreadShare extends Thread {
    private int count =5;
    @Override
    synchronized public void run() {
        super.run();
        count--;
        //此示例不要用for语句，因为使用同步后其他线程就得不到运行的机会了，
        //一直有一个线程进行减法运算
        System.out.println("由"+this.currentThread().getName()+"计算.count="+count);
    }

    public static void main(String[] args) {
        MyThreadShare myThreadShare = new MyThreadShare();
        Thread a = new Thread(myThreadShare,"A");
        Thread b = new Thread(myThreadShare,"B");
        Thread c = new Thread(myThreadShare,"C");
        Thread d = new Thread(myThreadShare,"D");
        Thread e = new Thread(myThreadShare,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
