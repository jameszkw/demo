package com.zkw.netty.newdemo;

import java.io.Serializable;

/**
 * 要传递的对象
 */
public class Command  implements Serializable{
    private static final long serialVersionUID = 7590999461767050471L;

    private String actionName;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
