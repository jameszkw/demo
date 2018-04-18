package com.zkw.concurrent.synchronizedemo.synchronized_string;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 8:49
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
