package com.zkw.concurrent.synchronizedemo.synchronized_waitforever;

/**
 * 同步方法无限等待模拟
 *
 * @author James
 * @create 2018-03-02 上午 9:48
 **/

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.start();
        ThreadB b=new ThreadB(service);
        b.start();
    }
}
