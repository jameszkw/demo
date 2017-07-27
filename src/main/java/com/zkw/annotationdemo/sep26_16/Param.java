package com.zkw.annotationdemo.sep26_16;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Param {
    long id();
    String name();
    int sex() default 1;

}
