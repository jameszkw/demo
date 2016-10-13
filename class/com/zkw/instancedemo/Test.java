package com.zkw.instancedemo;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public class Test {
    static void instanceTest(){
        System.out.println((new Son()) instanceof  Parent);
        System.out.println((new Son().getClass()).isInstance(new Parent()));
        System.out.println((new Parent()) instanceof  Son);
        System.out.println((new Parent().getClass()).isInstance(new Son()));
        System.out.println((new Son().getClass()).isInstance(new Son()));
        System.out.println((new Son()) instanceof  Son);
    }

    void staticNewTest() throws ClassNotFoundException {
        Class.forName("com.zkw.instancedemo.Son");
        new Son();
    }

    static void equalsObject(){
        Object a = new Object();
        Object b = new Object();
        System.out.println(a == b);
    }
    public static void main(String[] args){
//        instanceTest();
        equalsObject();
    }
}
