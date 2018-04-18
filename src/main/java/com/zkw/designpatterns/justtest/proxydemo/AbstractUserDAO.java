package com.zkw.designpatterns.justtest.proxydemo;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
//抽象UserDAO：抽象主题角色
public interface AbstractUserDAO {
    public Boolean findUserById(String userId);
}
