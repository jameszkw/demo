package com.zkw.creational.prototype.regesterProto;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class ConcretePrototype1 implements Prototype {
    private String name;

    public Prototype clone() {
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Now in Prototype1 , name = " + this.name;
    }
}
