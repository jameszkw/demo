package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_12;

import java.io.PipedOutputStream;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 8:56
 **/

public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream out;

    public ThreadWrite(WriteData writeData,PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
