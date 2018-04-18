package com.zkw.annotationdemo.gentablepro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2016/5/4 0004.
 * 为元素类型为注解（Constraints）的注解（Uniqueness）的注解元素（Constraints）赋值
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
