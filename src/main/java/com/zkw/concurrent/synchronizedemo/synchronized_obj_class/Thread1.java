package com.zkw.concurrent.synchronizedemo.synchronized_obj_class;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 下午 4:50
 **/

public class Thread1 implements Runnable{
    public void run() {
        SynchronizedTest s = SynchronizedTest.getInstance();
        s.method1();
//        SynchronizedTest s1 = new SynchronizedTest();
//        s1.method1();
        SynchronizedTest.staticIn.method1();
//      SynchronizedTest.staticMethod1();
//      SynchronizedTest.staticMethod2();
    }
}
