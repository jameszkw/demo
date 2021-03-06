package com.zkw.designpatterns.creational.prototype.regesterProto;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class ConcretePrototype2 implements Prototype {
    private String name;
    public Prototype clone(){
        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    public String toString(){
        return "Now in Prototype2 , name = " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
