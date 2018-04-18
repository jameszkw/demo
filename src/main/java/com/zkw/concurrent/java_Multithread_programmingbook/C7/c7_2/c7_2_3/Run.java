package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_3;

/**
 * 自动归属就是自动归到当前线程组中
 *
 * @author James
 * @create 2017-09-19 下午 9:36
 **/

public class Run {
    public static void main(String[] args) {
        //方法activeGroupCount()取得当前线程对象中的子线程组数量
        //方法enumerate()的作用是将线程组中的子线程组以复制的形式
        //拷贝到ThreadGroup[]数组对象中
        System.out.println("A处线程："+Thread.currentThread().getName()+"所属的线程组名："+Thread.currentThread().getThreadGroup().getName()+" 中有线程组数量："+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group=new ThreadGroup("新的组");//自动加到main组中
        System.out.println("B处线程："+Thread.currentThread().getName()+"所属的线程组名："+Thread.currentThread().getThreadGroup().getName()+" 中有线程组数量："+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroups=new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroups);
        for (int i=0;i<threadGroups.length;i++){
            System.out.println("第一个线程组名称为："+threadGroups[i].getName());
        }

    }
}
