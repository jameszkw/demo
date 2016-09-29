package com.zkw.event.demo;

import java.util.EventObject;

/**
 * 事件类,用于封装事件源及一些与事件相关的参数.
 */
public class CusEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private Object source;//事件源

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public CusEvent(Object source) {
        super(source);
    }
}
