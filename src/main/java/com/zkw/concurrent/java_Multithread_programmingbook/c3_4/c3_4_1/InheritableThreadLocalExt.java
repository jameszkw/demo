package com.zkw.concurrent.java_Multithread_programmingbook.c3_4.c3_4_1;

import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:12
 **/

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();

    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+" 我这子线程加的";
    }
}
