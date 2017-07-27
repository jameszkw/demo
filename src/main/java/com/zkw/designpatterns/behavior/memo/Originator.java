package com.zkw.designpatterns.behavior.memo;

/**
 * 发起人角色类，发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来。
 *
 * @author James
 * @create 2017-06-28 下午 2:32
 **/

public class Originator {
    private String state;

    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }

}
