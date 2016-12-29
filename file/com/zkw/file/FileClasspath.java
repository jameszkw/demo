package com.zkw.file;

import java.io.InputStream;

/**
 * Created by Administrator on 2016/12/9 0009.
 */
public class FileClasspath {
    public static void main(String[] args) {
        InputStream stream = FileClasspath.class.getResourceAsStream("/bytebuffer.txt");
        System.out.println(stream != null);
        stream = FileClasspath.class.getClassLoader().getResourceAsStream("bytebuffer.txt");
        System.out.println(stream != null);
    }
}
