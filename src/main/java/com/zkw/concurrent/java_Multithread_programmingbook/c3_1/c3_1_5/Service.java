package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 线程调用wait()与sleep()时，调用此线程对象的interrupt()方法都会出现InterruptedException异常。
 *
 * @author James
 * @create 2017-09-11 下午 8:06
 **/

public class Service {
    public void testMethod(Object lock){
        synchronized (lock){
            System.out.println("begin wait()");
           /* try {
//                lock.wait();
//                Thread.sleep(500000000);
                System.out.println("end wait()");
            } catch (InterruptedException e) {
                System.out.println("出现异常了，因为wait状态的线程被interrupt了");
                e.printStackTrace();
            }*/
            writeFile();
        }
    }

    private void writeFile(){
        File file=new File("D:/file.txt");
        FileOutputStream outputStream = null;
        try {
            outputStream=new FileOutputStream(file);
            for (int i=0;i<3000000;i++){
                outputStream.write("test".getBytes());
            }
            file.createNewFile();
        } catch (IOException e) {
            try {
                outputStream.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
