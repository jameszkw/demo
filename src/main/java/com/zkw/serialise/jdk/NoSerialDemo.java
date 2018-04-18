package com.zkw.serialise.jdk;

import java.io.Serializable;

/**
 * 没有序列化串
 * 说明：如果有对此类的修改，之前序列化到磁盘的对象反序列化后就会报错。因为，序列号由jvm自动改变
 *
 * @author James
 * @create 2017-08-03 上午 11:00
 **/

public class NoSerialDemo implements Serializable {

    private String name;
    private String name2;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
