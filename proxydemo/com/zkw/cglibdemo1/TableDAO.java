package com.zkw.cglibdemo1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class TableDAO {
    public void create(){
        System.out.println("create() is running !");
    }
    public void query(){
        System.out.println("query() is running !");
    }
    public void update(){
        System.out.println("update() is running !");
    }
    public void delete(){
        System.out.println("delete() is running !");
    }

}
