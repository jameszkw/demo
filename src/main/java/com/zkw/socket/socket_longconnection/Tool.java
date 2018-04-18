package com.zkw.socket.socket_longconnection;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/**
 * 由于以字节数组传递包头,就涉及到字节数组和int类型转换的问题,java中int类型是4个字节,所以用byte[4]来装
 *
 * @author James
 * @create 2017-12-29 下午 4:46
 **/

public class Tool {
    //int 转字节数组
    public static byte[] intToByteArray1(int i) {
        byte[] result = new byte[4];
        result[0] = (byte)((i >> 24) & 0xFF);
        result[1] = (byte)((i >> 16) & 0xFF);
        result[2] = (byte)((i >> 8) & 0xFF);
        result[3] = (byte)(i & 0xFF);
        return result;
    }

    public static byte[] intToByteArray2(int i) throws Exception {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(buf);
        out.writeInt(i);
        byte[] b = buf.toByteArray();
        out.close();
        buf.close();
        return b;
    }

    //字节数组转int
    public static int byteArrayToInt(byte[] b) {
        int intValue=0;
        for(int i=0;i<b.length;i++){
            intValue +=(b[i] & 0xFF)<<(8*(3-i));
        }
        return intValue;
    }
}
