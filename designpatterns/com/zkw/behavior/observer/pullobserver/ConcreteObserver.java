package com.zkw.behavior.observer.pullobserver;

import com.zkw.behavior.observer.pushobserver.ConcreteSubject;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public class ConcreteObserver implements Observer{
    //观察者的状态
    private String observerState;

    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = subject.getState();
        System.out.println("观察者状态为："+observerState);
    }
}
