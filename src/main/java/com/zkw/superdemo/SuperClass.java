package com.zkw.superdemo;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public class SuperClass {
    public SuperClass() {
        System.out.println("super construct...");
    }
    public SuperClass(int i){
        System.out.println("super params: "+i);
    }

    public void printMethod(){
        System.out.println("super...");
    }
}
