package com.zkw.classloader.exceptiondemo;

/**
 * Created by Administrator on 2016/5/19 0019.
 *
 */
public class NotFountException {
    public static void main(String[] args) {
        try {
            Class.forName("notfoundclass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
