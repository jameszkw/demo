package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:44
 **/

public class Test2 {
    public static void main(String[] args) {
        String lock = new String();
        System.out.println("syn上面");

        try {
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("syn下面的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
