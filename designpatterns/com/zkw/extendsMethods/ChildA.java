package com.zkw.extendsMethods;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public class ChildA extends Parent {
    public void doPro() {
        System.out.println("childA");
    }

    public static void main(String[] args) {
        Parent p=new ChildA();
        p.doProParent();
    }
}
