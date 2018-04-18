package com.zkw.concurrent.synchronizedemo.synchronized_obj_class;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试synchronized修饰静态方法和非静态方法的区别
 *
 * @author James
 * @create 2018-02-27 下午 4:56
 **/

public class ThreadMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(t1);
        exec.execute(t2);
        exec.shutdown();
    }
}
