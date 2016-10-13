package com.zkw.relationship;

/**
 * Created by Administrator on 2016/10/11 0011.
 */
public abstract class Daughter extends Parent {
    public abstract void makeUp();

    @Override
    public void getProperty() {
        System.out.println("daughter getProperty... ...");
    }
}
