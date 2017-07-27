package com.zkw.jmx.notification;

import javax.management.AttributeChangeNotification;
import javax.management.NotificationBroadcasterSupport;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class ServerConfigure extends NotificationBroadcasterSupport implements ServerConfigureMBean  {
    private AtomicLong sequenceNumber=new AtomicLong(1);
    private int port;
    private String host;

    public void setPort(int port) {
        int oldPort=this.port;
        this.port = port;
        AttributeChangeNotification notification=new AttributeChangeNotification(this,
                sequenceNumber.getAndIncrement(),
                System.currentTimeMillis(),
                AttributeChangeNotification.ATTRIBUTE_CHANGE,
                "Server Port Change",
                "java.lang.Integer",
                oldPort + "",
                this.port + "" );
        super.sendNotification(notification);
    }

    public void setHost(String host) {
        String oldHost = this.host;
        this.host = host;
        AttributeChangeNotification notification = new AttributeChangeNotification(this,
                sequenceNumber.getAndIncrement(),
                System.currentTimeMillis(),
                AttributeChangeNotification.ATTRIBUTE_CHANGE,
                "Server Host Change",
                "java.lang.String",
                oldHost,
                this.host   );
        super.sendNotification(notification);
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
