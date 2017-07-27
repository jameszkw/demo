package com.zkw.designpatterns.behavior.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-29 下午 3:18
 **/

public abstract class Expression {
    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     */
    public abstract boolean interpret(Context ctx);
    /**
     * 检验两个表达式在结构上是否相同
     */
    public abstract boolean equals(Object obj);
    /**
     * 返回表达式的hash code
     */
    public abstract int hashCode();
    /**
     * 将表达式转换成字符串
     */
    public abstract String toString();
}
