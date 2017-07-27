package com.zkw.designpatterns.behavior.iteratorpattern.intrinsic;

/**
 * 抽象迭代子角色类
 *
 * @author James
 * @create 2017-06-28 上午 10:05
 **/

public interface  Iterator {
    /**
     * 迭代方法：移动到第一个元素
     */
    public void first();
    /**
     * 迭代方法：移动到下一个元素
     */
    public void next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    public boolean isDone();
    /**
     * 迭代方法：返还当前元素
     */
    public Object currentItem();
}
