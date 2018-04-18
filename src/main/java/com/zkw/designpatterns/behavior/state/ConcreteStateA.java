package com.zkw.designpatterns.behavior.state;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-28 下午 4:26
 **/

public class ConcreteStateA implements State {
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }
}
