package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_8;

/**
 * 同步不能继承 如果想要Sub类的方法
 *
 * @author James
 * @create 2017-09-06 下午 10:02
 **/

public class Test {
    public static void main(String[] args) {
        Sub subRef= new Sub();
        ThreadA a=new ThreadA(subRef);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
