package com.zkw.nio.xtwy.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class ServerSocketChannelDemo{

    public static void start() throws Exception{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8999));
        serverSocketChannel.configureBlocking(false);

        while (true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null){
                ByteBuffer buf = ByteBuffer.allocate(48);
                int size = socketChannel.read(buf);
                while (size > 0){
                    buf.flip();
                    Charset charset = Charset.forName("UTF-8");
                    System.out.println(charset.newDecoder().decode(buf).toString());
                    size = socketChannel.read(buf);
                }
                buf.clear();
                ByteBuffer response = ByteBuffer.wrap("hello 小美，我已经接受到你的邀请!".getBytes("UTF-8"));
                socketChannel.write(response);
                response.clear();
            }
        }

    }

    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
