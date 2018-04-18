package com.zkw.socket.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by lifeng
 * 2017/11/28 14:14
 */
public class IOClient {

    public void connect(String ip,int port){
        Socket client = null;
        OutputStream out = null;
        InputStream in = null;
        try {
            client = new Socket(ip,port);
            out = client.getOutputStream();
            out.write("1234".getBytes("utf-8"));
            out.flush();
            in = client.getInputStream();
            //定义缓存区
            byte[] buf = new byte[1024];
            int length;
            while((length = in.read(buf)) !=-1){
                System.out.println("收到服务端信息:"+new String(buf,0,length,"UTF-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        IOClient ioClient = new IOClient();
        ioClient.connect("127.0.0.1",12345);
    }
}
