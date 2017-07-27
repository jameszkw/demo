package com.zkw.designpatterns.behavior.iteratorpattern.intrinsic;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-28 上午 10:05
 **/

public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
