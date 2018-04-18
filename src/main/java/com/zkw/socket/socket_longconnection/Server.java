package com.zkw.socket.socket_longconnection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 长连接
 *
 * @author James
 * @create 2017-12-29 下午 4:42
 **/

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("服务器端--开始监听");
            while (true) {
                Socket socket  = serverSocket.accept();
                ServerHandel hm = new ServerHandel(socket);
                Thread t = new Thread(hm);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
