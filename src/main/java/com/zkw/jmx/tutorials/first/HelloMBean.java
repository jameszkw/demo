package com.zkw.jmx.tutorials.first;

/**
 * Created by Administrator on 2016/5/24 0024.
 * MBean
 */
public interface HelloMBean {
    public String getName();
    public void setName(String name);
    public void printHello();
    public void printHello(String whoName);
}
