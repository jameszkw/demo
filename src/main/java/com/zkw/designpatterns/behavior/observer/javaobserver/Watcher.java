package com.zkw.designpatterns.behavior.observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Watcher implements Observer {
    public Watcher(Observable o){
        o.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }
}
