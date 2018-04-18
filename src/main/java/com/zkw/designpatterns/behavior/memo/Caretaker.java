package com.zkw.designpatterns.behavior.memo;

/**
 * 负责人角色类，负责人角色负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容
 *
 * @author James
 * @create 2017-06-28 下午 2:33
 **/

public class Caretaker {
    private Memento memento;

    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
