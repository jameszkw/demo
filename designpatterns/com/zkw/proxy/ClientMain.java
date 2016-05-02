package com.zkw.proxy;

/**
 * Created by Administrator on 2016/5/1 0001.
 */
public class ClientMain {
    public static void main(String[] args) {
        AbstractObject abObj = new ProxyObject();
        abObj.operation();
    }
}
