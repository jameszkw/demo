package com.zkw.protobuf.media;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
public class MethodBean {

    private Object bean;
    private Method method;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getBean() {

        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
