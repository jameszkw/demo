package com.zkw.designpatterns.structural.decorator.variant;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(ConcreteComponent concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void sampleOperator() {
        System.out.println("ConcreteDecoratorA sampleOperator... ...");
    }
}
