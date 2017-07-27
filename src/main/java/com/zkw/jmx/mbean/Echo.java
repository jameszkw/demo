package com.zkw.jmx.mbean;

/**
 * Created by Administrator on 2016/5/23 0023.
 */
public class Echo implements EchoMBean {
    public void print(String yourName) {
        System.out.println("Hi " + yourName + "!");
    }
}
