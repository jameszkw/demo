package com.zkw.jmx.mxbean;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public interface ServerConfigureMBean {
    public int getPort();

    public void setPort(int port);

    public String getHost();

    public void setHost(String host);

    public int getMaxThread();

    public void setMaxThread(int maxThread);

    public int getMinThread();

    public void setMinThread(int minThread);
}
