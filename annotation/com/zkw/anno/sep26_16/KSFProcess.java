package com.zkw.anno.sep26_16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class KSFProcess {
    public static void processFilter(String clazz) throws SecurityException,
            ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        //遍历clazz对应的类里的所有方法
        for (Method m : Class.forName(clazz).getMethods()){
            //该方法使用了@Kangshifu修饰
            if (m.isAnnotationPresent(Kangshifu.class)){
                //调用m方法
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception e) {
                    System.out.println("生产流程" + m + "运行异常：" + e.getCause());
                    failed++;
                }
            }


        }
        //统计测试结果
        System.out.println("该工厂共检测到生产流程" + (passed + failed) + "个，其中"
                + failed + "个失败，" + passed + "个正常!");
    }

    public static void main(String[] args) {
        try {
            KSFProcess.processFilter("com.zkw.anno.sep26_16.BJFactory");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
