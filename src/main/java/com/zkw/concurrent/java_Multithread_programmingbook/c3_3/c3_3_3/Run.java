package com.zkw.concurrent.java_Multithread_programmingbook.c3_3.c3_3_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:03
 **/

public class Run {
    public static ThreadLocalExt t1=new ThreadLocalExt();
    public static void main(String[] args) {
        if (t1.get()==null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
