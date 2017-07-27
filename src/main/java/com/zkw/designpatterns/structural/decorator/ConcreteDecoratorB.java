package com.zkw.designpatterns.structural.decorator;

/**
 * Created by Administrator on 2016/5/19 0019.
 * 具体装饰角色
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 写相关的业务代码
    }
}
