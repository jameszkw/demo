package com.zkw.designpatterns.behavior.iteratorpattern.extrinsic;


/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-27 下午 5:27
 **/

public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
