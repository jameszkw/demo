package com.zkw.io;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class ByteCharArrays {
    private void byteInputRead()throws Exception{
        byte[] bytes=new byte[1];
        bytes[0]=Byte.parseByte("2");
        InputStream input=new ByteArrayInputStream(bytes);
        //read first byte
        int data=input.read();
        while (data!=-1){
            System.out.println((char) data);
            data=input.read();
        }
        input.close();
    }

    private static void byteOutputWrite()throws Exception{
        ByteOutputStream output=new ByteOutputStream();
        output.write("this is 大".getBytes("utf-8"));
        byte[] bytes=output.getBytes();

    }
    public static void main(String[] args) throws Exception{
        byteOutputWrite();
    }
}
