package com.zkw.event.demo1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public class DemoSource {
    private Vector repository = new Vector();//监听自己的监听器队列
    public DemoSource(){}
    public void addDemoListener(DemoListener dl) {
        repository.addElement(dl);
    }

    public void notifyDemoEvent() {//通知所有的监听器
        Enumeration enumeration = repository.elements();
        while(enumeration.hasMoreElements()) {
            DemoListener dl = (DemoListener)enumeration.nextElement();
            dl.handleEvent(new DemoEvent(this));
        }
    }
}
