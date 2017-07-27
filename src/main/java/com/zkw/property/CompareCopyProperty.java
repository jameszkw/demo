package com.zkw.property;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2016/7/26 0026.
 */
public class CompareCopyProperty {

    public static void main(String[] args) {
        BeanA a = new BeanA();
        a.setaGe("18");
        BeanB b = new BeanB();
        try {
            PropertyUtils.copyProperties(b, a);

            System.out.println(b.getAge());
            System.out.println(b.getSexBoy());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
