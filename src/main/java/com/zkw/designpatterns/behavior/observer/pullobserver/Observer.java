package com.zkw.designpatterns.behavior.observer.pullobserver;

/**
 * 抽象观察者类
 */
public interface Observer {
    /**
     * 更新接口
     * @param subject 传入主题对象，方便获取相应的主题对象的状态
     */
    public void update(Subject subject);
}
