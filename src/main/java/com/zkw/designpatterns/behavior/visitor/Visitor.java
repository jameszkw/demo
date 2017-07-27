package com.zkw.designpatterns.behavior.visitor;

/**
 * 抽象访问者
 *
 * @author James
 * @create 2017-06-29 上午 11:23
 **/

public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
