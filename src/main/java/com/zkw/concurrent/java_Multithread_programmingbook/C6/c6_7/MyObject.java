package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-19 下午 7:46
 **/

public class MyObject {
    public enum MyEnumSingleton{
        connectionFactory;
        private Object conn;

        MyEnumSingleton() {
            System.out.println("调用了MyObject的构造");
            this.conn = new Object();
        }
        public Object getObject(){
            return conn;
        }
    }

    public static Object getObject(){
        return MyEnumSingleton.connectionFactory.getObject();
    }
}
