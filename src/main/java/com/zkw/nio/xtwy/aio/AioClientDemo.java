package com.zkw.nio.xtwy.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class AioClientDemo {
    public static void startClient(){
        try {
            AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();
            Future future = asynchronousSocketChannel.connect(new InetSocketAddress("localhost",8999));
            future.get();
            ByteBuffer byteBuffer = ByteBuffer.wrap("hello aio server".getBytes("UTF-8"));
            asynchronousSocketChannel.write(byteBuffer);
            byteBuffer.clear();
            asynchronousSocketChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        startClient();
    }
}
