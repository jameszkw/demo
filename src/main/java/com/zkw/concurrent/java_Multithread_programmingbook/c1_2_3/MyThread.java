package com.zkw.concurrent.java_Multithread_programmingbook.c1_2_3;

/**
 * 自定义线程类中的实例变量针对其他线程的不共享数据“count”
 *
 * @author James
 * @create 2017-09-04 下午 9:53
 **/

public class MyThread extends Thread {
    private int count =5;

    public MyThread(String name) {
        super();
        this.setName(name);//设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算.count="+count);
        }
    }

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
