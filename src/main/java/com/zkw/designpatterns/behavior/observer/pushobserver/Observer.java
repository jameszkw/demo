package com.zkw.designpatterns.behavior.observer.pushobserver;

/**
 * Created by Administrator on 2016/9/29 0029.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
