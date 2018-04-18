package com.zkw.concurrent.synchronizedemo.synchronized_obj_class;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 下午 4:55
 **/

public class Thread2 implements Runnable{
    public void run() {
        SynchronizedTest s = SynchronizedTest.getInstance();
//        SynchronizedTest s2 = new SynchronizedTest();
//        s2.method1();
        s.method2();
        SynchronizedTest.staticMethod1();
        SynchronizedTest.staticMethod2();
        SynchronizedTest.staticIn.method2();
        SynchronizedTest.staticIn.staticMethod1();
    }
}
