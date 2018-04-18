package com.zkw.designpatterns.behavior.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 上午 11:24
 **/

public class VisitorA implements Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node) {

    }
}
