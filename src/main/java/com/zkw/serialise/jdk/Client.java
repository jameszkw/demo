package com.zkw.serialise.jdk;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-08-03 上午 11:01
 **/

public class Client {

    private static void write(){
        //写入磁盘
        NoSerialDemo demo = new NoSerialDemo();
        demo.setName("no");
        try {
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E://jack.test")));
            oo.writeObject(demo);
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void read(){
        //从磁盘读取
        NoSerialDemo person = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E://jack.test")));
            person = (NoSerialDemo)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String name= person.getName();
        System.out.print("name is: "+name);
    }
    public static void main(String[] args) {
//        write();
        read();
    }
}
