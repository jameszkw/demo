package com.zkw.jmx.mxbean.variant;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class Server implements ServerMBean {
    /**
     * 封装
     */
    private ServerConfigure serverConfigure;

    public Server(ServerConfigure serverConfigure) {
        this.serverConfigure = serverConfigure;
    }

    public ServerConfigure getServerConfigure() {
        synchronized (serverConfigure) {
            return this.serverConfigure;
        }
    }

    public void setServerConfigure(ServerConfigure serverConfigure) {
        synchronized (serverConfigure) {
            this.serverConfigure = serverConfigure;
        }
    }

    public void defaultServerConfigure() {
        synchronized (serverConfigure) {
            serverConfigure.setPort(80);
            serverConfigure.setHost("www.haitao.com");
            serverConfigure.setMinThread(10);
            serverConfigure.setMaxThread(500);
        }
    }
}
