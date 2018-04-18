package com.zkw.concurrent.java_Multithread_programmingbook.c3_3.c3_3_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:01
 **/

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认的值 第一次get不再为null";
    }
}
