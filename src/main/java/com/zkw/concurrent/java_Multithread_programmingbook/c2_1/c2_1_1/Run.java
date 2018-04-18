package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_1;

/**
 * 方法内的变量是线程安全
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
