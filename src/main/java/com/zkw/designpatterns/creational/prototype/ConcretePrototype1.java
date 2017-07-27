package com.zkw.designpatterns.creational.prototype;

/**
 * Created by Administrator on 2016/5/16 0016.
 * 具体原型角色
 */
public class ConcretePrototype1 implements Prototype {
    @Override
    public Object clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
