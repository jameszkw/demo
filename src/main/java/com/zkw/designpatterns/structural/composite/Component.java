package com.zkw.designpatterns.structural.composite;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-27 上午 10:08
 **/

abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void Add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display(int depth);
}
