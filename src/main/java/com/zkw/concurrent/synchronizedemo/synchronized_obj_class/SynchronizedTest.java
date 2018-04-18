package com.zkw.concurrent.synchronizedemo.synchronized_obj_class;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 下午 4:45
 **/

public class SynchronizedTest {
    public static SynchronizedTest staticIn = new SynchronizedTest();   //静态对象

    /*private static SynchronizedTest st;           //懒汉式单例模式，线程不安全，需要加synchronized同步
    private SynchronizedTest(){}
    public static SynchronizedTest getInstance(){
        if(st == null){
            st = new SynchronizedTest();
        }
        return st;
    }*/

    private static final SynchronizedTest st = new SynchronizedTest();  //饿汉式单利模式，天生线程安全
    private SynchronizedTest(){}
    public static SynchronizedTest getInstance(){
        return st;
    }

    /**
     * 非静态方法1
     */
    public synchronized void method1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("method1 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * 非静态方法2
     */
    public synchronized void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("method2 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    /**
     * 静态方法1
     */
    public synchronized static void staticMethod1(){
        for( int i = 0; i < 10 ; i++){
            System.out.println("static method1 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    /**
     * 静态方法2
     */
    public synchronized static void staticMethod2(){
        for( int i = 0; i < 10 ; i++){
            System.out.println("static method2 is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
