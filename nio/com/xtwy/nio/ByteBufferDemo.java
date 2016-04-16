package com.xtwy.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class ByteBufferDemo {
    //主要通过读取文件内容，写到ByteBuffer里，然后再从ByteBuffer对象中读取数据
    public static void readFile(String fileName){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"rw");
            FileChannel fileChannel = randomAccessFile.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(3);
            int size = fileChannel.read(byteBuffer);
            while (size>0){
                //把byteBuffer从写模式，转变成读模式
                byteBuffer.flip();
                Charset charset = Charset.forName("UTF-8");
                System.out.println(charset.newDecoder().decode(byteBuffer).toString());

                byteBuffer.clear();
                size = fileChannel.read(byteBuffer);
            }
            fileChannel.close();
            randomAccessFile.close();
        } catch (FileNotFoundException e  ) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
