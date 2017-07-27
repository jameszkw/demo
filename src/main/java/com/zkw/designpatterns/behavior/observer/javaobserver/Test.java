package com.zkw.designpatterns.behavior.observer.javaobserver;

import java.util.Observer;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public class Test {
    public static void main(String[] args) {
        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
    }
}
