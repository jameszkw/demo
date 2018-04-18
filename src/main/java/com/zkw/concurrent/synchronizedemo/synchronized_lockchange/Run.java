package com.zkw.concurrent.synchronizedemo.synchronized_lockchange;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 5:56
 **/

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService =new MyService();
        ThreadA a=new ThreadA(myService);
        a.setName("A");
        ThreadB b=new ThreadB(myService);
        b.setName("B");
        a.start();
        Thread.sleep(50);//存在50毫秒
        b.start();
    }
}
