package com.zkw.reflect.invokemethodprivate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-01-19 上午 9:36
 **/

public class Test {
    private void te(){
        if (null != "1"){
            System.out.println("fuck");
        }
    }

    private void test(){
        TargetClass targetClass=new TargetClass();
        try {
            Method send = targetClass.getClass().getDeclaredMethod("send",Object1.class);
            send.setAccessible(true);
            Object1 object1 = new Object1();
            object1.setQue("2");
            send.invoke(targetClass,object1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Test targetClass=new Test();
        targetClass.te();

    }
}
