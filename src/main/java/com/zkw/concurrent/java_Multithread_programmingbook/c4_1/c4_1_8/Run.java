package com.zkw.concurrent.java_Multithread_programmingbook.c4_1.c4_1_8;

/**
 * 此程序会出现假死状态，将signal变为signalAll后可解决。
 * 疑问：1为什么while里打印多次？2为什么会假死？
 * 1.因为B线程运行到await()时释放的锁有肯被B线程有争抢到，所以出现同一个线程类争抢到多次的情况。2.而又因为
 * condition.signal()只激活一个等待锁的线程，就会不断有等待锁的线程增加。
 * @author James
 * @create 2017-09-17 下午 3:41
 **/

public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA[] threadAs=new ThreadA[10];
        ThreadB[] threadBs=new ThreadB[10];
        for (int i=0;i<10;i++){
            threadAs[i]=new ThreadA(service);
            threadBs[i]=new ThreadB(service);
            threadAs[i].start();
            threadBs[i].start();
        }
    }
}
