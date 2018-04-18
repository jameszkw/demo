package com.zkw.jmx.mbean;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2016/5/23 0023.
 */
public class EchoMain {
    public static void main(String[] args) {
        // 创建MBeanServer
        MBeanServer mbs= ManagementFactory.getPlatformMBeanServer();
        try {
            // 新建MBean ObjectName, 在MBeanServer里标识注册的MBean
            ObjectName name=new ObjectName("com.zkw.jmx.mbean:type=Echo");
            // 创建MBean
            Echo mbean = new Echo();
            // 在MBeanServer里注册MBean, 标识为ObjectName(com.zkw.jmx.mbean:type=Echo)
            mbs.registerMBean(mbean,name);
            // 在MBeanServer里调用已注册的EchoMBean的print方法
            mbs.invoke(name, "print", new Object[] { "zkw"}, new String[] {"java.lang.String"});
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
