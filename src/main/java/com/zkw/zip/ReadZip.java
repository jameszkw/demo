package com.zkw.zip;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-06 下午 3:59
 **/

public class ReadZip {
    public static void readZipFile(String file) throws Exception {
        Charset gbk = Charset.forName("gbk");
        ZipFile zf = new ZipFile(file, gbk);
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        ZipInputStream zin = new ZipInputStream(in,gbk);
        ZipEntry ze;
        while ((ze = zin.getNextEntry()) != null) {
            if (ze.isDirectory()) {
            } else {
                System.err.println("file - " + ze.getName() + " : " + ze.getSize() + " bytes");
                long size = ze.getSize();
                if (size > 0) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(zf.getInputStream(ze)));
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();
                }
                System.out.println();
            }
        }
        zin.closeEntry();
    }

    public static void main(String[] args) {
        try {
            readZipFile("D:\\tmp\\bill.zip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
