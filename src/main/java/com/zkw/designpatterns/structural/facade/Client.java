package com.zkw.designpatterns.structural.facade;

/**
 * Created by Administrator on 2016/5/7 0007.
 * 客户端角色类
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
