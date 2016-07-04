package com.zkw.classloader.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class MyTestMain {
    public static void main(String[] args) {
        //读取本地的class文件内的字节码，转换成字节码数组
        File file=new File(".");
        try {
            InputStream inputStream=new FileInputStream(file.getCanonicalPath()+"\\target\\classes\\com\\zkw\\classloader\\demo1\\Programmer.class");
            byte[] result=new byte[1024];
            int count=inputStream.read(result);
            // 使用自定义的类加载器将 byte字节码数组转换为对应的class对象
            MyClassLoader loader=new MyClassLoader();
            Class clazz = loader.defineMyClass(result,0,count);
            //测试加载是否成功，打印class 对象的名称
            System.out.println(clazz.getName());
            //实例化一个Programmer对象
            Object o=clazz.newInstance();
            //调用Programmer的code方法
            clazz.getMethod("code",null).invoke(o,null);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
