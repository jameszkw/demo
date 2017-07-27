package com.zkw.designpatterns.behavior.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 11:25
 **/

public class VisitorB implements Visitor {
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
