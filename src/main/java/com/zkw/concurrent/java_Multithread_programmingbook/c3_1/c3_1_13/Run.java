package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_13;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 通过管道进行线程间通信：字符流
 *
 * @author James
 * @create 2017-09-12 下午 9:09
 **/

public class Run {
    public static void main(String[] args) {
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();
        PipedReader inputStream=new PipedReader();
        PipedWriter outputStream=new PipedWriter();

        try {
            inputStream.connect(outputStream);
//            outputStream.connect(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ThreadRead threadRead=new ThreadRead(readData,inputStream);
        threadRead.start();
        ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);
        threadWrite.start();
    }
}
