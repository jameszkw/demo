package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:28
 **/

public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service3");
    }
}
