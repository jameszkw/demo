package com.zkw.reflect.classtest;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-27 上午 9:57
 **/

public class Foo implements FooParents {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void yell() {
        System.out.println("Foo yell");
    }
}
