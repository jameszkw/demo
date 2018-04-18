package com.zkw.superdemo;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public class SubClass extends SuperClass {
    public SubClass() {
        super(2);
        System.out.println("sub construct");
    }

    @Override
    public void printMethod() {
        System.out.println("subclass...");
        super.printMethod();

    }

    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.printMethod();
    }
}
