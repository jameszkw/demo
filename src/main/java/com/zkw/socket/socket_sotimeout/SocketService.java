package com.zkw.socket.socket_sotimeout;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * setSoTimeout()方法
 *
 * @author James
 * @create 2017-12-29 上午 11:25
 **/

public class SocketService {
    public static void main(String[] args) {
        SocketAddress address=new InetSocketAddress("127.0.0.1", 30001);
        // 启动监听端口 8001
        ServerSocket ss = null;
        try {
            ss = new ServerSocket();
            ss.bind(address);
            // 接收请求
            Socket s = ss.accept();
            new Thread(new T(s)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class T implements Runnable {
        private Socket socket = null;

        public T(Socket socket) {
            this.socket = socket;
        }

        public Socket getSocket() {
            return socket;
        }
        public void setSocket(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            System.out.println(socket.toString());
            try {
                socket.setKeepAlive(true);
                socket.setSoTimeout(5 * 1000);
                String _pattern = "yyyy-MM-dd HH:mm:ss";
                SimpleDateFormat format = new SimpleDateFormat(_pattern);
                while (true) {
                    System.out.println("开始：" + format.format(new Date()));
                    try {
                        InputStream ips = socket.getInputStream();
                        ByteArrayOutputStream bops = new ByteArrayOutputStream();
                        int data = -1;
                        while((data = ips.read()) != -1){
                            System.out.println(data);
                            bops.write(data);
                        }
                        System.out.println(Arrays.toString(bops.toByteArray()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Thread.sleep(1000);
                    System.out.println(socket.isBound()); // 是否邦定
                    System.out.println(socket.isClosed()); // 是否关闭
                    System.out.println(socket.isConnected()); // 是否连接
                    System.out.println(socket.isInputShutdown()); // 是否关闭输入流
                    System.out.println(socket.isOutputShutdown()); // 是否关闭输出流
                    System.out.println("结束：" + format.format(new Date()));
                }
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
