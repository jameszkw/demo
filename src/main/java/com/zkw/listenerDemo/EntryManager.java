package com.zkw.listenerDemo;

/**
 * 博客文章管理器
 *
 * @author Administrator
 */
public class EntryManager {
    public void addEntry(Entry entry) {
        System.out.println("add entry ...id=" + entry.getId());
        // 事件分发
        EntryEvent event = new EntryEvent(EntryEvent.ENTRY_ADDED, entry, null);
        EntryEventDispatcher.getInstance().dispatchEvent(event);
    }

    public void deleteEntry(Entry entry) {
        System.out.println("delete entry ...id="+entry.getId());
        // 事件分发
        EntryEvent event = new EntryEvent(EntryEvent.ENTRY_DELETED, entry, null);
        EntryEventDispatcher.getInstance().dispatchEvent(event);
    }

    public void modifyEntry(Entry entry) {
        System.out.println("modify entry ...id="+entry.getId());
        // 事件分发
        EntryEvent event = new EntryEvent(EntryEvent.ENTRY_MODIFIED, entry, null);
        EntryEventDispatcher.getInstance().dispatchEvent(event);
    }
}
