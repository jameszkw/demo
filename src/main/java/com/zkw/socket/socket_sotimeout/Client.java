package com.zkw.socket.socket_sotimeout;

import java.io.IOException;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-12-29 下午 3:51
 **/

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 30001);
            socket.setKeepAlive(true);
            while(true && null != socket){
                Thread.sleep(10 * 1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
