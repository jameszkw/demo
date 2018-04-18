package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_12;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 8:42
 **/

public class ReadData {
    public void readMethod(PipedInputStream input){
        System.out.println("read :");
        byte[] byteArray=new byte[20];
        try {
            int readLength=input.read(byteArray);
            while (readLength!=-1){
                String newData=new String(byteArray,0,readLength);
                System.out.println(newData);
                readLength=input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
