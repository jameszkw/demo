package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_13;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 9:03
 **/

public class WriteData {
    public void writeMethod(PipedWriter out){
        System.out.println("write: ");
        for (int i=0;i<300;i++){
            String outData=""+(i+1);
            try {
                out.write(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(outData);
        }
        System.out.println();
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
