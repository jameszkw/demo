package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_14;

/**
 * 等待/通知之交叉备份
 *
 * @author James
 * @create 2017-09-12 下午 9:21
 **/

public class Run {
    public static void main(String[] args) {
        DBTools dbTools=new DBTools();
        for (int i=0;i<20;i++){
            BackupB b=new BackupB(dbTools);
            b.start();
            BackupA a=new BackupA(dbTools);
            a.start();
        }
    }
}
