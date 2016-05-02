package com.zkw.staticproxy;

/**
 * Created by Administrator on 2016/5/1 0001.
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        System.out.println("realObject operate");
    }
}
