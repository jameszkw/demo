package com.zkw.designpatterns.behavior.visitor;

/**
 * 抽象节点类
 *
 * @author James
 * @create 2017-06-29 上午 11:25
 **/

public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
