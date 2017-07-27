package com.zkw.designpatterns.structural.facade;

/**
 * Created by Administrator on 2016/5/7 0007.
 * 门面角色类
 */
public class Facade {
    //示意方法，满足客户端需要的功能
    public void test(){
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}
