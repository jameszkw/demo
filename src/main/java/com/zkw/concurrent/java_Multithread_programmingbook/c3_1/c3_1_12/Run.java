package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 通过管道进行线程间通信：字节流
 *
 * @author James
 * @create 2017-09-12 下午 8:46
 **/

public class Run {
    public static void main(String[] args) {
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();

        PipedInputStream inputStream=new PipedInputStream();
        PipedOutputStream outputStream=new PipedOutputStream();

        try {
            outputStream.connect(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ThreadRead read=new ThreadRead(readData,inputStream);
        read.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);
        threadWrite.start();
    }
}
