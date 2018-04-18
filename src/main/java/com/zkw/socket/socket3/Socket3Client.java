package com.zkw.socket.socket3;

import java.io.*;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-11-28 下午 8:35
 **/

public class Socket3Client {
    public static final String IP_ADDR = "localhost";//服务器地址
    public static final int PORT = 12345;//服务器端口号

    public static void main(String[] args) {
        System.out.println("客户端启动...");
        while (true) {
            Socket socket = null;
            InputStream in = null;
            OutputStream out = null;
            //创建一个流套接字并将其连接到指定主机上的指定端口号
            try {
                socket = new Socket(IP_ADDR, PORT);
                //向服务端写数据
//                out = socket.getOutputStream();
                PrintWriter write = new PrintWriter(socket.getOutputStream());
                write.print("服务端你好，我是客户端\n");
                write.flush();

                String line = null;
                in = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                while ((line = br.readLine()) != null){
                    System.out.println("Client接收到的数据："+line);
                }
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                    in.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
