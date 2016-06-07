package com.zkw.structural.decorator.justTest;

import java.io.*;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class JustTestDemo {
    public static void main(String[] args) {
        InputStream inputStream;
        // 流式读取文件
        DataInputStream dis=null;
        try {
//            dis=new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\test.txt")));
            dis=new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\test.txt")));
            //读取文件内容
            byte[] bs=new byte[dis.available()];
            dis.read(bs);
            String content = new String(bs);
            System.out.println(content);
            dis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
