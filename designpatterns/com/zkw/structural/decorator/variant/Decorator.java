package com.zkw.structural.decorator.variant;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class Decorator extends ConcreteComponent {
    public ConcreteComponent concreteComponent;

    public Decorator(ConcreteComponent concreteComponent) {
        this.concreteComponent = concreteComponent;
    }

    @Override
    public void sampleOperator() {
        super.sampleOperator();

    }
}
