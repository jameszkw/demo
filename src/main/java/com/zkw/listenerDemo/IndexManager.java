package com.zkw.listenerDemo;

/**
 * 索引管理器
 * @author Administrator
 *
 */
public class IndexManager implements EntryListener{
    public void entryAdded(EntryEvent entryevent) {
        System.out.println("IndexManager 处理 博客文章被创建事件。");
    }

    public void entryDeleted(EntryEvent entryevent) {
        System.out.println("IndexManager 处理 博客文章被删除事件。");
    }

    public void entryModified(EntryEvent entryevent) {
        System.out.println("IndexManager 处理 博客文章被修改事件。");
    }
}
