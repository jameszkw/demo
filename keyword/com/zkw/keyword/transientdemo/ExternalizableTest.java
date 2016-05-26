package com.zkw.keyword.transientdemo;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class ExternalizableTest {
    public static void main(String[] args) {
        System.out.println("序列化之前");
        Blip b = new Blip("This String is " , 47);
        System.out.println(b);

        System.out.println("序列化操作，writeObject");
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos=new ObjectOutputStream(out);
            oos.writeObject(b);
            System.out.println("反序列化之后,readObject");
            ByteArrayInputStream in=new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(in);
            Blip bb = (Blip)ois.readObject();
            System.out.println(bb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
