package com.zkw.designpatterns.justtest.proxydemo;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
//具体UserDAO类：真实主题角色
public class UserDAO implements AbstractUserDAO {
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询ID为" + userId + "的用户信息成功！");
            return true;
        }
        else {
            System.out.println("查询ID为" + userId + "的用户信息失败！");
            return false;
        }
    }
}
