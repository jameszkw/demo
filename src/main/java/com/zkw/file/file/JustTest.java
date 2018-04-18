package com.zkw.file.file;

import org.apache.commons.io.IOUtils;

import java.io.File;

/**
 * Created by Administrator on 2016/7/4 0004.
 */
public class JustTest {
    public static void main(String[] args) {
        String baseName="E:\\logs\\";
        File file=new File("E:\\logs\\log.log");
        String entryName = file.getAbsolutePath().substring(
                baseName.length());
        System.out.println(entryName);
        System.out.println(file.getAbsolutePath());

    }
}
