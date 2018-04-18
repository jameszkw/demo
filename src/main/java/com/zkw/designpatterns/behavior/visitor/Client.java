package com.zkw.designpatterns.behavior.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 2:20
 **/

public class Client {
    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new NodeA());
        //给结构增加一个节点
        os.add(new NodeB());
        //创建一个访问者
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}