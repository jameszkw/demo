package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_12;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 8:40
 **/

public class WriteData {
    public void writeMethod(PipedOutputStream out){
        System.out.println("write:");
        for (int i=0;i<300;i++){
            String outData=""+(i+1);
            try {
                out.write(outData.getBytes());
                System.out.println(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
