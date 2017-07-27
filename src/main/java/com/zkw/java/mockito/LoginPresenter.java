package com.zkw.java.mockito;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-16 上午 9:46
 **/

public class LoginPresenter {
    private UserManager mUserManager = new UserManager();

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;
        if (PasswordValidator.verifyPassword(password)) return;

//        mUserManager.performLogin(username, password);
        //login的结果将通过callback传递回来。
        mUserManager.performLogin(username, password, new UserManager.NetworkCallback() {
            public void onSuccess(Object data) {

            }

            public void onFailure(int code, String msg) {

            }
        });
    }


    public void setUserManager(UserManager userManager) {  //<==
        this.mUserManager = userManager;
    }
}
