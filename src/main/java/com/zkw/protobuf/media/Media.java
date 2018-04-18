package com.zkw.protobuf.media;

import com.google.protobuf.ByteString;
import com.zkw.protobuf.pb.RequestMsgProtobuf;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
public class Media {

    public static Map<String,MethodBean> methodBeans = new HashMap<String, MethodBean>();

    public static Object execute(RequestMsgProtobuf.RequestMsg requestMsg){
        Object response = null;
        try {
            String cmd = requestMsg.getCmd();
            MethodBean methodBean = methodBeans.get(cmd);
            Method method = methodBean.getMethod();
            Object bean = methodBean.getBean();

            //获取目标方法参数类型
            Class parameterType = method.getParameterTypes()[0];
            //目标方法参数类型的所有构造方法
            Constructor[] constructors = parameterType.getConstructors();

            Constructor c = null;
            for (Constructor constructor : constructors){
                if (constructor.getParameterTypes()[0].getName().equals("boolean")){
                    c = constructor;
                }
            }

            if (c != null){
                c.setAccessible(true);
            }
            //初始化参数
            Object parameterObj = c.newInstance(true);
            ByteString requestParam = requestMsg.getRequestParam();
            Method paramMethod = parameterType.getMethod("parseFrom",ByteString.class);

            //对方法参数赋值
            parameterObj = paramMethod.invoke(parameterObj,requestParam);
            response = method.invoke(bean,parameterObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;

    }

}
