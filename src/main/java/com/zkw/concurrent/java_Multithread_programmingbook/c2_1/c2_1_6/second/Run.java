package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6.second;

/**
 * 当存在父子类关系时，子类是完全可以通过“可重入锁”调用父类的同步方法的
 *
 * @author James
 * @create 2017-09-06 下午 9:39
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
