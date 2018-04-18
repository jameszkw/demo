package com.zkw.jmx.mxbean.variant;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class ServerTest {
    public static void main(String[] args) throws Exception{
        testServerMBean();
    }

    public static void testServerMBean() throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ServerConfigure serverConfigure = new ServerConfigure(8080,
                "test.haitao.com", 20, 100);
        Server server = new Server(serverConfigure);
        ObjectName serverName = new ObjectName(
                "com.zkw.jmx.mxbean.variant:type=Server");
        mbs.registerMBean(server, serverName);
        System.out.println("Waiting...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
