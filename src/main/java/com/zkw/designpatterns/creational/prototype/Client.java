package com.zkw.designpatterns.creational.prototype;

/**
 * Created by Administrator on 2016/5/16 0016.
 * 客户端角色
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }
}
