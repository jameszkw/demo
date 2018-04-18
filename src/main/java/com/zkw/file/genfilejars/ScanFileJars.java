package com.zkw.file.genfilejars;

import java.io.File;

/**
 * 扫码文件夹下的jar包，用于classpath
 *
 * @author James
 * @create 2017-04-28 上午 9:57
 **/

public class ScanFileJars {
    public static void main(String[] args) {
//        String dictory="D:\\workspacePaypalmDubbo\\Alioth\\gateway-wechat\\wechat-asyn-callback\\target\\lib";
        String dictory="D:\\workspacePaypalmDubbo\\Alioth\\gateway-wechat\\test\\target\\lib";
        File file = new File(dictory);
        String[] fileList =  file.list();
        for (int i = 0; i < fileList.length; i++) {
//            System.out.print("D:\\tmp\\lib\\"+fileList[i]+";");
//            System.out.print("./lib/"+fileList[i]+";");//windows
            System.out.print("./lib/"+fileList[i]+":");//linux
        }
    }
}
