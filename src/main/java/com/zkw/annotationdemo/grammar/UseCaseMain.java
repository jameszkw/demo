package com.zkw.annotationdemo.grammar;

import java.util.List;

/**
 * Created by Administrator on 2016/5/4 0004.
 * 注解使用
 */
public class UseCaseMain {
    @UseCase(id=47,description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id=48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id=49,description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords,String password){
        return !prevPasswords.contains(password);
    }
}
