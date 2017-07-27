package com.zkw.java.mockito;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-16 上午 9:47
 **/

public class UserManager {
    public void performLogin(String username, String password){
//        System.out.println("username: "+username+" password: "+password);
    }

    public void performLogin(String username, String password,NetworkCallback callback){

    }

    interface NetworkCallback{
        public void onSuccess(Object data);


        public void onFailure(int code, String msg);
    }
}
