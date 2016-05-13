package com.zkw.structural.adapter.ObjectAdapter;

/**
 * Created by Administrator on 2016/5/3 0003.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1(){
        adaptee.sampleOperation1();
    }

    public void sampleOperation2() {

    }
}
