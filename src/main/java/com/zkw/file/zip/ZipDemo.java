package com.zkw.file.zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-08-08 下午 5:03
 **/

public class ZipDemo {


    public static byte[] releaseCompression(byte[] bytesArray) throws IOException{

        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(bytesArray));

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        ZipEntry ze  = null;

        while((ze = zis.getNextEntry()) != null){

            int fileSize = (int) ze.getSize();

            byte[] b = new byte[fileSize];
            int rb = 0, chunk = 0;

            //通过循环一次把数据全部都读到内存中去
            while(fileSize - rb > 0)
            {
                chunk = zis.read(b, rb, fileSize - rb);
                if (chunk <= 0)
                {
                    break;
                }
                rb += chunk;
            }

            bos.write(b);
            zis.close();
            break;
        }

        return bos.toByteArray();
    }

    public static void main(String[] args) {
    }
}
