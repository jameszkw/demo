package com.zkw.jmx.tutorials.notificationdemo;

import com.sun.jdmk.comm.HtmlAdaptorServer;
import com.zkw.jmx.tutorials.first.Hello;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class HelloAgent {
    public static void main(String[] args) {
        MBeanServer server= MBeanServerFactory.createMBeanServer();
        try {
            ObjectName helloName=new ObjectName("james:name=Hello");
            Hello hello=new Hello();
            server.registerMBean(hello,helloName);
            ObjectName adapterName=new ObjectName("HelloAgent:name=htmladapter,port=8082");
            HtmlAdaptorServer adaptor=new HtmlAdaptorServer();
            server.registerMBean(adaptor,adapterName);

            Jack jack=new Jack();
            server.registerMBean(jack,new ObjectName("HelloAgent:name=jack"));
            jack.addNotificationListener(new HelloListener(),null,hello);
            adaptor.start();
            System.out.println("start... ...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
