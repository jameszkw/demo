package com.zkw.socket.socket_longconnection;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-12-29 下午 5:01
 **/

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            System.out.println("客户端开始连接");
            //一直读取控制台
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                //包体
                byte [] content = br.readLine().getBytes();
                //包头,固定4个字节,包含包体长度信息
                byte [] head = Tool.intToByteArray1(content.length);
                BufferedOutputStream bis = new BufferedOutputStream(socket.getOutputStream());
                bis.write(head);
                bis.flush();
                bis.write(content);
                bis.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
