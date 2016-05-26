package com.zkw.keyword.transientdemo;

import java.io.*;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class TransientDemo2 {
    public static void main(String[] args) {
        User2 user = new User2();
        user.setUsername("Alexia");
        user.setPasswd("123456");

        System.out.println("read before Serializable: ");
        System.out.println("username: " + user.getUsername());
        System.err.println("password: " + user.getPasswd());

        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:/user.txt"));
            out.writeObject(user);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 在反序列化之前改变username的值
        User2.username = "jmwang";
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/user.txt"));
            user=(User2)in.readObject();
            in.close();
            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
