package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_15.fourth;

/**
 * 静态内部类class1 如果有synchronized(class1)对class1上锁后，类内的其他synchronized修改的代码块或方法为同步的
 * 非静态内部类的话是异步的。
 *
 * @author James
 * @create 2017-09-09 下午 4:20
 **/

public class Run {
    public static void main(String[] args) {
        OutClass outClass =new OutClass();
        final OutClass.InnerClass1 in1=new OutClass.InnerClass1();
        final OutClass.InnerClass2 in2=outClass.new InnerClass2();
        Thread t1=new Thread(new Runnable() {
            public void run() {
                in1.method1(in2);
            }
        },"T1");

        Thread t2=new Thread(new Runnable() {
            public void run() {
                in1.method2();
            }
        },"T2");

        Thread t3=new Thread(new Runnable() {
            public void run() {
                in2.method1();
            }
        },"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
