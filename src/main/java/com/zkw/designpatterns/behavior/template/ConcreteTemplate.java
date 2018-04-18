package com.zkw.designpatterns.behavior.observer.template;

/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        //业务相关的代码
    }

    @Override
    protected void hookMethod() {
        //业务相关的代码
    }
}
