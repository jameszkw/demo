package com.zkw.jmx.notification;

import javax.management.Notification;
import javax.management.NotificationListener;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class ServerConfigureNotificationListener implements NotificationListener {
    public void handleNotification(Notification notification, Object handback) {
        log("SequenceNumber:" + notification.getSequenceNumber());
        log("Type:" + notification.getType());
        log("Message:" + notification.getMessage());
        log("Source:" + notification.getSource());
        log("TimeStamp:" + notification.getTimeStamp());
    }

    private void log(String message) {
        System.out.println(message);
    }
}
