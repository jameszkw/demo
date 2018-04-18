package com.zkw.designpatterns.structural.decorator.variant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-06 下午 2:39
 **/

public class Client {

    private void test(){
        List list = new ArrayList();

    }
    public static void main(String[] args) {
        ConcreteComponent con = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA(con);
        a.sampleOperator();
        Set set = new HashSet();
    }
}
