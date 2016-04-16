package com.xtwy.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class AioServerDemo {

    private static CountDownLatch latch;
    public static void starServer() {
        try {
            final AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
            asynchronousServerSocketChannel.bind(new InetSocketAddress(8999));
            latch = new CountDownLatch(1);

            asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {

                public void failed(Throwable exc, Object attachment) {
                    latch.countDown();
                }

                public void completed(AsynchronousSocketChannel result, Object attachment) {
                    asynchronousServerSocketChannel.accept(attachment,this);
                    try {
                        operate(result);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected static void operate(AsynchronousSocketChannel ch) throws Exception{
        ByteBuffer buf = ByteBuffer.allocate(48);
        int size = ch.read(buf).get();
        while (size>0){
            buf.flip();
            Charset charset = Charset.forName("UTF-8");
            System.out.println(charset.newDecoder().decode(buf).toString());
            size = ch.read(buf).get();
        }
        ch.close();
    }

    public static void main(String[] args) {
        starServer();
    }
}
