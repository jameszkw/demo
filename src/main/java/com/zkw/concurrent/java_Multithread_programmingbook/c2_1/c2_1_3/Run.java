package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_3;


import com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_2.HasSelfPrivateNum;
import com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_2.ThreadA;
import com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_2.ThreadB;

/**
 * 多个对象多个锁
 *
 * @author James
 * @create 2017-09-05 下午 9:37
 **/

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
