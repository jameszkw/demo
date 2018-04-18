package com.zkw.catchDemo;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存管理器
 * 实现缓存逻辑，支持对象的增加、修改和删除，支持值对象的泛型
 * @author James
 * @create 2017-08-30 下午 8:36
 **/

public class CacheContext<T> {
    private ConcurrentHashMap<String,T> cache = new ConcurrentHashMap<String,T>();

    public T get(String key){
        return cache.get(key);
    }

    public void addOrUpdateCache(String key,T value){
        cache.put(key, value);
    }

    // 根据 key 来删除缓存中的一条记录
    public void evictCache(String key) {
        if (cache.containsKey(key)){
            cache.remove(key);
        }
    }

    // 清空缓存中的所有记录
    public void evictCache() {
        cache.clear();
    }
}
