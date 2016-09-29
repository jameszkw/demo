package com.zkw.instancedemo;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public class Son extends Parent {
    static {
        System.out.println("loadding ...");
    }
    public Son() {
        System.out.println("initting ...");
    }
}
