package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_10.first;

/**
 * getHoldCount()查询当前线程保存此锁定的个数，也就是调用lock()方法的次数。
 *
 * @author James
 * @create 2017-09-17 下午 5:20
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        service.serviceMethod1();
    }
}
