package com.zkw.jmx.mxbean;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class ServerTest {
    public static void main(String[] args) {
        try {
            testServerConfigureMBean();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testServerConfigureMBean() throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ServerConfigure serverConfigure = new ServerConfigure(8080,
                "test.haitao.com", 20, 100);

        ObjectName serverName = new ObjectName(
                "com.zkw.jmx.mxbean:type=ServerConfigure");
        mbs.registerMBean(serverConfigure, serverName);
        System.out.println("Waiting...");
        Thread.sleep(Long.MAX_VALUE);

    }
}
