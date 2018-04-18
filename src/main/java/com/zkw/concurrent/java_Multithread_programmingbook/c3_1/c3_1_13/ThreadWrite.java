package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_13;


import java.io.PipedWriter;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 8:56
 **/

public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter out;

    public ThreadWrite(WriteData writeData, PipedWriter out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
