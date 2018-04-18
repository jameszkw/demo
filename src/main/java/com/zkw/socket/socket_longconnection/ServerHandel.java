package com.zkw.socket.socket_longconnection;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 服务器端线程类
 *
 * @author James
 * @create 2017-12-29 下午 4:43
 **/

public class ServerHandel implements Runnable {
    public static int count = 0;
    Socket socket = null;

    public ServerHandel(Socket socket) {
        count++;
        this.socket = socket;
        System.out.println("用户" + count + "接入");
    }

    public void run() {
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(socket.getInputStream());
            while (true) {
                byte [] head = new byte[4];
                bis.read(head);
                byte [] data = new byte[Tool.byteArrayToInt(head)];
                bis.read(data);
                System.out.println(new String(data).trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
