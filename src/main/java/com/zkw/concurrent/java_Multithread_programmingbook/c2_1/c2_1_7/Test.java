package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_7;

/**
 * 当一个线程执行的代码出现异常时，其所持有的锁会自动释放
 *
 * @author James
 * @create 2017-09-06 下午 9:51
 **/

public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();

    }
}
