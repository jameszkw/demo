package com.zkw.annotationdemo.grammar;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public @interface SimulatingNull {
    public int id() default -1;
    public String description() default "";
}
