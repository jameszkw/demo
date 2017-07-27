package com.zkw.jmx.notification;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class ServerMain {
    public static void main(String[] args) {
        // 创建MBeanServer
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        // 新建MBean ObjectName, 在MBeanServer里标识注册的MBean
        try {
            ObjectName name = new ObjectName("com.zkw.jmx.notification:type=ServerConfigure");
            // 创建MBean
            ServerConfigure mbean = new ServerConfigure();
            // 在MBeanServer里注册MBean, 标识为ObjectName(com.zkw.jmx.notification:type=ServerConfigure)
            mbs.registerMBean(mbean, name);
            // 自定义观察者
            ServerConfigureNotificationListener listener = new ServerConfigureNotificationListener();
            // 加入MBeanServer
            mbs.addNotificationListener(name, listener, null, null);
            Thread.sleep(Long.MAX_VALUE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
