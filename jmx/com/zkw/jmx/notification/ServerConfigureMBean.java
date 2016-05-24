package com.zkw.jmx.notification;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public interface ServerConfigureMBean {
    public void setPort(int port);

    public int getPort();

    public void setHost(String host);

    public String getHost();
}
