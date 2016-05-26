package com.zkw.keyword.transientdemo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class User2 implements Serializable {
    private static final long serialVersionUID = 8294180014912103005L;

    public static String username;
    private transient String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
