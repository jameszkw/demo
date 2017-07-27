package com.zkw.designpatterns.structural.decorator.variant;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(ConcreteComponent concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void sampleOperator() {
        System.out.println("ConcreteDecoratorB sampleOperator... ...");
    }
}
