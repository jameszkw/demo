package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_6;

/**
 * 证明synchronized(this)也是锁定当前对象的
 * 在otherMethod（）方法前面加synchronized的话就变成同步的。
 *
 * @author James
 * @create 2017-09-07 下午 8:39
 **/

public class Run {
    public static void main(String[] args) {
        Task task=new Task();
        Thread1 thread1 =new Thread1(task);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread2 thread2=new Thread2(task);
        thread2.start();
    }
}
