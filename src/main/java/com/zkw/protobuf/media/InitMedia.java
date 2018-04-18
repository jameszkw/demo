package com.zkw.protobuf.media;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/19 0019.
 * spring容器初始化成功后执行
 */
@Component
public class InitMedia implements ApplicationListener<ContextRefreshedEvent>,Ordered{

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Map<String,Object> beanMap = contextRefreshedEvent.getApplicationContext().getBeansWithAnnotation(Controller.class);

        for (String key : beanMap.keySet()){

            Object bean = beanMap.get(key);
            Method[] methods = bean.getClass().getDeclaredMethods();
            if (methods == null || methods.length == 0){
                continue;
            }
            for (Method method : methods){
                if (method.isAnnotationPresent(Remote.class)){
                    Remote remote = method.getAnnotation(Remote.class);
                    String cmd = remote.value();

                    MethodBean methodBean = new MethodBean();
                    methodBean.setBean(bean);
                    methodBean.setMethod(method);
                    Media.methodBeans.put(cmd,methodBean);
                    System.out.println("cmd: "+cmd);
                }
            }


        }
    }

    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
