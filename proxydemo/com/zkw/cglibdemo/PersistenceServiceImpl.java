package com.zkw.cglibdemo;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class PersistenceServiceImpl implements PersistenceService {
    public String load(long id) {
        return "Jason Zhicheng Li";
    }

    public void save(long id, String data) {
        System.out.println(data + " has been saved successfully.");
    }
}
