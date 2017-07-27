package com.zkw.java.mockito;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-16 上午 10:19
 **/

public class PasswordValidator {
    public static boolean verifyPassword(String password){
        if (password.equals("xiaochuang_is_handsome")){
            return true;
        } else if (password.equals("xiaochuang_is_not_handsome")){
            return false;
        }
        return false;
    }
}
