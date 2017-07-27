package com.zkw.designpatterns.behavior.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 2:16
 **/

public class NodeA extends Node {
    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }
}
