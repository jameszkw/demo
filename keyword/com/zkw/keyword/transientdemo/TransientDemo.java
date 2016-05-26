package com.zkw.keyword.transientdemo;

import java.io.*;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class TransientDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Alexia");
        user.setPasswd("123456");

        System.out.println("read before Serializable: ");
        System.out.println("username: " + user.getUsername());
        System.err.println("password: " + user.getPasswd());


        try {
            ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("D:/user.txt"));
            output.writeObject(user);
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream input=new ObjectInputStream(new FileInputStream("D:/user.txt"));
            user=(User)input.readObject();
            input.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
