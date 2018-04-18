package com.zkw.annotationdemo.gentablepro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2016/5/4 0004.
 * 用于生成数据库表
 */
@Target(ElementType.TYPE)//applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
