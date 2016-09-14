package com.zkw.extendsMethods;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public abstract class Parent {

    public void doProParent(){
        doPro();
        System.out.println("doProParnet");
    }

    protected abstract void doPro();
}
