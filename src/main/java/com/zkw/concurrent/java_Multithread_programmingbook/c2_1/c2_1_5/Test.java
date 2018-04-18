package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_5;

/**
 * 模拟脏读
 * 在getValue()前加synchronized就可以
 *
 * @author James
 * @create 2017-09-06 下午 8:35
 **/

public class Test {
    public static void main(String[] args) {
        PublicVar publicVarRef = new PublicVar();
        ThreadA threadA = new ThreadA(publicVarRef);
        threadA.start();
        try {
            Thread.sleep(200);//打印结果受此值大小影响
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
