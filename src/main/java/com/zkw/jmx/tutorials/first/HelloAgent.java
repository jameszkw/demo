package com.zkw.jmx.tutorials.first;

import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class HelloAgent {
    public static void main(String[] args) {
        MBeanServer mBeanServer= MBeanServerFactory.createMBeanServer();
        try {
            ObjectName objectName=new ObjectName("james:name=HelloWorld");
            mBeanServer.registerMBean(new Hello(),objectName);
            ObjectName adapterName=new ObjectName("HelloAgent:name=htmladapter,port=8082");
            HtmlAdaptorServer adaptor=new HtmlAdaptorServer();
            mBeanServer.registerMBean(adaptor,adapterName);
            adaptor.start();
            System.out.println("start.....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
