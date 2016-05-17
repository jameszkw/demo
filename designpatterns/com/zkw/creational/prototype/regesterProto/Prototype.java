package com.zkw.creational.prototype.regesterProto;

/**
 * Created by Administrator on 2016/5/16 0016.
 * 抽象原型角色
 */
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
