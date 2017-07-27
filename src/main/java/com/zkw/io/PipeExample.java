package com.zkw.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2016/5/26 0026.
 * illustrate: threads more often exchange complete objects rather than raw byte data
 */
public class PipeExample {
    public static void main(String[] args) {
        final PipedOutputStream output;
        final PipedInputStream input;
        try {
            output=new PipedOutputStream();
            input=new PipedInputStream(output);
            Thread t1=new Thread(new Runnable() {
                public void run() {
                    try {
                        output.write("hello pipe! 大".getBytes("UTF-8"));//中文没解决??
                        output.flush();
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread t2=new Thread(new Runnable() {
                public void run() {
                    try {
                        int data=input.read();
                        while (data!=-1){
                            System.out.print((char)data);
                            data=input.read();
                        }
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            });

            t1.start();
            t2.start();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
