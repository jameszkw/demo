package com.zkw.annotationdemo.sep26_16.generatefile;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Documented
public @interface Persistent {
    String table();
}
