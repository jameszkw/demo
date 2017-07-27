package com.zkw.designpatterns.justtest.cglibdemo;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public interface PersistenceService {
    public void save(long id, String data);
    public String load(long id);
}
