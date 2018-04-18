package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_14;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 9:20
 **/

public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
