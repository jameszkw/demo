package com.zkw.designpatterns.behavior.observer.strategy;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-23 上午 9:19
 **/
public interface Application {
    void init();
    void idle();
    void cleanup();
    boolean done();
}
