package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_6;

/**
 * 使用enum枚举数据类型实现单例模式
 *
 * @author James
 * @create 2017-09-19 下午 7:36
 **/

public enum  MyObject {
    connectionFactory;
    private Object connection;

    MyObject() {
        System.out.println("调用了MyObject的构造");
        this.connection = new Object();
    }

    public Object getObject(){
        return connection;
    }
}
