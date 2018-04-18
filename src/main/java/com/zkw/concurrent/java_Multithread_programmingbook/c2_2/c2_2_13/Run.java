package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_13;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 3:54
 **/

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass=new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        PublicClass.PrivateClass privateClass=publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
    }
}
