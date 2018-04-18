package com.zkw.concurrent.synchronizedemo.synchronized_reentrant;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:07
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
