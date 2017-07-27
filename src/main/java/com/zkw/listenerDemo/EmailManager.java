package com.zkw.listenerDemo;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
public class EmailManager implements EntryListener{
    public void entryAdded(EntryEvent entryevent) {
        System.out.println("EmailManager 处理 博客文章被创建事件。");
    }

    public void entryDeleted(EntryEvent entryevent) {
        System.out.println("EmailManager 处理 博客文章被删除事件。");
    }

    public void entryModified(EntryEvent entryevent) {
        System.out.println("EmailManager 处理 博客文章被修改事件。");
    }
}
