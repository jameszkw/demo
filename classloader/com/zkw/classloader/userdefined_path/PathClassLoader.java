package com.zkw.classloader.userdefined_path;

import java.io.*;

/**
 * Created by Administrator on 2016/5/19 0019.
 * 自定义路径下加载class文件
 */
public class PathClassLoader extends ClassLoader {
    private String classPath;
    private String packageName="net.xulingbo.classloader";

    public PathClassLoader(ClassLoader parent, String classPath) {
        super(parent);
        this.classPath = classPath;
    }

//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException {
//        if (packageName.startsWith(name)){
////            byte[] classData=
//        }
//    }

    private byte[] getData(String className){
        String path=classPath+ File.separatorChar+className.replace('.',File.separatorChar)+"class";
        try {
            InputStream is=new FileInputStream(path);
            ByteArrayOutputStream stream=new ByteArrayOutputStream();
            byte[] buffer=new byte[2048];
            int num=0;
            while ((num=is.read(buffer))!=-1){
                stream.write(buffer,0,num);
            }
            return stream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
