package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_13.second;

/**
 * 静态内部类
 *
 * @author James
 * @create 2017-09-09 下午 4:00
 **/

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass=new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        PublicClass.PrivateClass privateClass=new PublicClass.PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge()+" "+privateClass.getAddress());

    }
}
