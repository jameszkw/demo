package com.zkw.designpatterns.structural.decorator;

/**
 * Created by Administrator on 2016/5/19 0019.
 * 装饰角色
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void sampleOperation() {
        // 委派给构件
        component.sampleOperation();
    }
}
