package com.zkw.property.propertyutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class DemoMain {
    Person person = new Person();

    private void beanUtilsDemo(){
        try {
            BeanUtils.setProperty(person,"name","james");
            System.out.println(BeanUtils.getProperty(person,"name"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DemoMain demoMain=new DemoMain();
        try {
            PropertyUtils.setSimpleProperty(demoMain.person,"name","jay");
            System.out.println(PropertyUtils.getSimpleProperty(demoMain.person,"name"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        demoMain.beanUtilsDemo();
    }
}
