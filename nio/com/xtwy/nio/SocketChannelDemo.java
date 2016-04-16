package com.xtwy.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class SocketChannelDemo {
    public static void startClient() throws Exception{
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost",8999));
//        socketChannel.configureBlocking(false);

        String request = "hello ServerSocketChannel大";
        ByteBuffer byteBuffer = ByteBuffer.wrap(request.getBytes("UTF-8"));
        socketChannel.write(byteBuffer);

        ByteBuffer byteBuffer1 = ByteBuffer.allocate(48);
        int size = socketChannel.read(byteBuffer1);
        while (size>0){
            byteBuffer1.flip();
            Charset charset =Charset.forName("UTF-8");
            System.out.println(charset.newDecoder().decode(byteBuffer1).toString());
            byteBuffer1.clear();
            size = socketChannel.read(byteBuffer1);
        }
        byteBuffer.clear();

        socketChannel.close();
    }

    public static void main(String[] args) {
        try {
            startClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
