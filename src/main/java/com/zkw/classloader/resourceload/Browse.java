package com.zkw.classloader.resourceload;

/**
 * Created by Administrator on 2016/5/18 0018.
 */
public class Browse {
    public static void main(String[] args) {
        Browse browse=new Browse();
        System.out.println(browse.getClass().getClassLoader().getResource("").toString());
    }
}
