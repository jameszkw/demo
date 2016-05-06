package com.zkw.adapter.ClassAdapter;

/**
 * Created by Administrator on 2016/5/3 0003.
 */
public class Adapter extends Adaptee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    public void sampleOperation2() {

    }
}
