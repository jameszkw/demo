package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_2.Second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 上午 11:19
 **/

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1? ="+Thread.interrupted());
        System.out.println("是否停止2? ="+Thread.interrupted());
        System.out.println("end");
    }
}
