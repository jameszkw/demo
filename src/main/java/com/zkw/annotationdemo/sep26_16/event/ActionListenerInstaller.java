package com.zkw.annotationdemo.sep26_16.event;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class ActionListenerInstaller {
    //处理Annotation的方法，其中object是包含Annotation的对象
    public static void processAnnotations(Object object){
        //获取Object对应的类
        Class clazz = object.getClass();
        //遍历该类下所有已声明的Field
        for (Field field : clazz.getDeclaredFields()){
            //将该Feild设置成可自由访问
            field.setAccessible(true);
            //判断该Field是否被@ActionListenerFor修饰
            boolean b = field.isAnnotationPresent(ActionListenerFor.class);
            if(!b) continue;
            ActionListenerFor listenerFor = field.getAnnotation(ActionListenerFor.class);
            //获取Field实际对应的对象
            try {
                Object fObject =  field.get(object);
                //JButton继承于AbstractButton，如果fObject存在且继承于AbstractButton
                if(fObject != null && fObject instanceof AbstractButton){
                    //获取注释里的元数据listener
                    Class<? extends ActionListener> tempListener  = listenerFor.listener();
                    //使用反射来创建listener类的对象
                    ActionListener actionListener =tempListener.newInstance();
                    AbstractButton button =(AbstractButton)fObject;
                    button.addActionListener(actionListener);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
