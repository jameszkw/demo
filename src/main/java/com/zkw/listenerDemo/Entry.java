package com.zkw.listenerDemo;

/**
 * 博客文章 属于事件源
 * @author Administrator
 *
 */
public class Entry {
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private long id; // 编号
    private String name; //标题
}
