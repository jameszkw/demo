package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_2;


/**
 * 两个线程访问实例变量，并且没有对方法加锁。所以是非线程安全。
 *
 * @author James
 * @create 2017-09-05 下午 9:37
 **/

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
