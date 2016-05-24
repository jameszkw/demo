//package com.zkw.jmx.tutorials.dynamicMbean;
//
//import javax.management.*;
//import java.lang.reflect.Constructor;
//
///**
// * Created by Administrator on 2016/5/24 0024.
// */
//public class HelloDynamic implements DynamicMBean {
//    //这是我们的属性名称
//    private String name;
//    private MBeanInfo mBeanInfo = null;
//    private String className;
//    private String description;
//    private MBeanAttributeInfo[] attributes;
//    private MBeanConstructorInfo[] constructors;
//    private MBeanOperationInfo[] operations;
//    MBeanNotificationInfo[] mBeanNotificationInfoArray;
//
//    public HelloDynamic() {
//        init();
//        buildDynamicMBean();
//    }
//
//    private void init() {
//        className=this.getClass().getName();
//        description = "Simple implementation of a dynamic MBean.";
//        attributes = new MBeanAttributeInfo[1];
//        constructors = new MBeanConstructorInfo[1];
//        operations = new MBeanOperationInfo[1];
//        mBeanNotificationInfoArray = new MBeanNotificationInfo[0];
//    }
//
//    private void buildDynamicMBean() {
//        //设定构造函数
//        Constructor[] thisconstructors = this.getClass().getConstructors();
//        constructors[0] = new MBeanConstructorInfo("HelloDynamic(): Constructs a HelloDynamic object", thisconstructors[0]);
//        //设定一个属性
//        attributes[0] = new MBeanAttributeInfo("Name", "java.lang.String", "Name: name string.", true, true, false);
//        //operate method 我们的操作方法是print
//        MBeanParameterInfo[] params = null;//无参数
//        operations[0] = new MBeanOperationInfo("print", "print(): print the name", params, "void", MBeanOperationInfo.INFO);
//        mBeanInfo = new MBeanInfo(className, description, attributes, constructors, operations, mBeanNotificationInfoArray);
//    }
//
//
//}
