package com.zkw.designpatterns.behavior.state;

/**
 * 抽象状态类
 *
 * @author James
 * @create 2017-06-28 下午 4:25
 **/
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
