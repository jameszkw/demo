package com.zkw.socket.socket_backlog;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 测试ServerSocket backlog参数
 *
 * @author James
 * @create 2017-12-28 上午 11:24
 **/

public class Test_backlog {
    public static void main(String[] args) {
        BufferedReader in=null;
        PrintWriter out =null;
        int backlog=2;

        try {
            ServerSocket serverSocket=new ServerSocket(10000,backlog);
            while (true){
                System.out.println("启动服务端......");
                int i;
                Socket socket=serverSocket.accept();
                System.out.println("有客户端连上服务端, 客户端信息如下：" + socket.getInetAddress() + " : " + socket.getPort() + ".");
                in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out =new PrintWriter(socket.getOutputStream(),true);
                do {
                    char[] c=new char[1024];
                    i=in.read(c);
                    System.out.println("服务端收到信息: " + new String(c, 0, i));
                }while (i ==-1);
                out.print("服务端收到请求");
                out.flush();
                out.close();
                in.close();
                socket.close();
                System.out.println("关闭服务端......");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
