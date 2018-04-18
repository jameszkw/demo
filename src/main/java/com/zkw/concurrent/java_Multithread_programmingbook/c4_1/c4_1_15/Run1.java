package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_15;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-17 下午 9:07
 **/

public class Run1 {
    public static void main(String[] args) {
        Service service=new Service();
        MyThreadA myThreadA=new MyThreadA(service);
        myThreadA.start();
    }
}
