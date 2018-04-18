package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2;

/**
 * 懒汉模式
 *
 * @author James
 * @create 2017-09-18 下午 9:16
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    public static MyObject getInstance(){
        //延迟加载
        if(myObject!=null){
        }else {
            myObject=new MyObject();
        }
        return myObject;
    }
}
