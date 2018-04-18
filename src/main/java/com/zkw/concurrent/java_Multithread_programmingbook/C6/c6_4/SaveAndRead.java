package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_4;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 10:08
 **/

public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject=MyObject.getInstance();
            FileOutputStream fos=new FileOutputStream(new File("my.txt"));
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(myObject);
            oos.close();
            fos.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis=new FileInputStream(new File("my.txt"));
            ObjectInputStream ois=new ObjectInputStream(fis);
            MyObject myObject=(MyObject)ois.readObject();
            ois.close();
            fis.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
