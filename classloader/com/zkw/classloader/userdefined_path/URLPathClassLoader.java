package com.zkw.classloader.userdefined_path;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Administrator on 2016/6/26 0026.
 */
public class URLPathClassLoader extends URLClassLoader {
    private String packageName="";

    public URLPathClassLoader(URL[] classPath, ClassLoader parent) {
        super(classPath, parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> aClass=findLoadedClass(name);
        if (aClass!=null){
            return aClass;
        }
        if (!packageName.startsWith(name)){
            return super.loadClass(name);
        } else {
            return findClass(name);
        }
    }
}
