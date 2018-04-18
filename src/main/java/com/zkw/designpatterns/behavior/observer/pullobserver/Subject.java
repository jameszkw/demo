package com.zkw.designpatterns.behavior.observer.pullobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public abstract class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();
    /**
     * 注册观察者对象
     * @param observer    观察者对象
     */
    public void attach(Observer observer){

        list.add(observer);
        System.out.println("Attached an observer");
    }
    /**
     * 删除观察者对象
     * @param observer    观察者对象
     */
    public void detach(Observer observer){

        list.remove(observer);
    }
    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(){

        for(Observer observer : list){
            observer.update(this);
        }
    }

    public abstract String getState();
}
