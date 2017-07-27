package com.zkw.jmx.mxbean.variant;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public interface ServerMBean {
    public ServerConfigure getServerConfigure();

    public void setServerConfigure(ServerConfigure serverConfigure);

    public void defaultServerConfigure();
}
