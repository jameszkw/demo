package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_13;


import java.io.PipedReader;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 8:54
 **/

public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
