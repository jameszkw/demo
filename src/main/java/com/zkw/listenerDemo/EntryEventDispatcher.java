package com.zkw.listenerDemo;

import java.util.ArrayList;

/**
 * 博客文章事件分发器
 *
 * @author Administrator
 */
public class EntryEventDispatcher {
    private static EntryEventDispatcher instance = new EntryEventDispatcher();
    private ArrayList listeners = new ArrayList();

    public static EntryEventDispatcher getInstance() {
        return instance;
    }

    private EntryEventDispatcher() {
        String[] observers = PropertyMgr.getProperty("observers").split(",");
        for (String s : observers) {
            System.out.println(s);
            try {
                this.addListener((EntryListener) (Class.forName(s).newInstance()));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void addListener(EntryListener listener) {
        System.out.println(":" + listener);
        if (listener == null) {
            System.out.println(":" + listener);
            throw new NullPointerException();
        } else {
            listeners.add(listener);
            return;
        }
    }

    public synchronized void removeListener(EntryListener listener) {
        listeners.remove(listener);
    }

    public void dispatchEvent(EntryEvent event) {
        // System.out.println("msgDispatchEvent");
        int eventType = event.getEventType();
        long t1 = System.currentTimeMillis();
        System.out.println("kaishi=" + t1);

        for (int i = 0; i < listeners.size(); i++) {
            EntryListener listener = (EntryListener) listeners.get(i);
            String name = listener.getClass().getName();
            name = name.substring(name.lastIndexOf('.') + 1);
            switch (eventType) {
                case EntryEvent.ENTRY_ADDED: // 创建博客文章
                    listener.entryAdded(event);
                    break;

                case EntryEvent.ENTRY_DELETED: // 删除博客文章
                    listener.entryDeleted(event);
                    break;

                case EntryEvent.ENTRY_MODIFIED: //修改 博客文章
                    listener.entryModified(event);
                    break;
            }
        }
        System.out.println("cost time="+(System.currentTimeMillis()-t1));
    }



}
