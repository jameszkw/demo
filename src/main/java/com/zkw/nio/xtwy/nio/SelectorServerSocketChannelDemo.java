package com.zkw.nio.xtwy.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class SelectorServerSocketChannelDemo {
    public static void startServer(){
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8999));
            Selector selector = Selector.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true){
                //每一个连接，只会select一次
                int select = selector.select();
                //是否有可用的通道已接入
                if (select>0){
                    for (SelectionKey key : selector.selectedKeys()){
                        if (key.isAcceptable()){
                            SocketChannel socketChannel = ((ServerSocketChannel)key.channel()).accept();
                            ByteBuffer byteBuffer = ByteBuffer.allocate(48);
                            int size = socketChannel.read(byteBuffer);
                            while (size>0){
                                byteBuffer.flip();
                                Charset charset = Charset.forName("UTF-8");
                                System.out.println(charset.newDecoder().decode(byteBuffer).toString());
                                size = socketChannel.read(byteBuffer);
                            }
                            byteBuffer.clear();

                            ByteBuffer byteBuffer1 = ByteBuffer.wrap("您好!我已经收到了您的请求!".getBytes("UTF-8"));
                            socketChannel.write(byteBuffer1);
                            socketChannel.close();
                            selector.selectedKeys().remove(key);
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        startServer();
    }
}
