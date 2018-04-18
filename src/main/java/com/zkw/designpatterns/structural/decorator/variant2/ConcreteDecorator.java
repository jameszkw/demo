package com.zkw.designpatterns.structural.decorator.variant2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-06 下午 2:46
 **/

public class ConcreteDecorator implements Component {
    private Component component;

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    public void sampleOperation() {
        component.sampleOperation();
    }
}
