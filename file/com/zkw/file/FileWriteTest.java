package com.zkw.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWriteTest {   

    public FileWriteTest() {   

    }   

    public static void main(String[] args) {   

        FileOutputStream out = null;   

        FileOutputStream outSTr = null;   

        BufferedOutputStream Buff=null;   

        FileWriter fw = null;   

        int count=1000;//写文件行数   

        try {   

            out = new FileOutputStream(new File("C:/add.txt"));   

            long begin = System.currentTimeMillis();   

            for (int i = 0; i < count; i++) {   

                out.write("测试java 文件操作\r\n".getBytes());   

            }   

            out.close();   

            long end = System.currentTimeMillis();   

            System.out.println("FileOutputStream执行耗时:" + (end - begin) + " 豪秒");   

            outSTr = new FileOutputStream(new File("./db/localDB.db"));   

             Buff=new BufferedOutputStream(outSTr);   

            long begin0 = System.currentTimeMillis();   

            for (int i = 0; i < count; i++) {   

                Buff.write("测试java 文件操作\r\n".getBytes());   

            }   

            Buff.flush();   

            Buff.close();   

            long end0 = System.currentTimeMillis();   

            System.out.println("BufferedOutputStream执行耗时:" + (end0 - begin0) + " 豪秒");   

            fw = new FileWriter("C:/add2.txt");   

            long begin3 = System.currentTimeMillis();   

            for (int i = 0; i < count; i++) {   

                fw.write("测试java 文件操作\r\n");   

            }   

                        fw.close();   

            long end3 = System.currentTimeMillis();   

            System.out.println("FileWriter执行耗时:" + (end3 - begin3) + " 豪秒");   

        } catch (Exception e) {   

            e.printStackTrace();   

        }   

        finally {   

            try {   

                fw.close();   

                Buff.close();   

                outSTr.close();   

                out.close();   

            } catch (Exception e) {   

                e.printStackTrace();   

            }   

        }   

    }   

}
