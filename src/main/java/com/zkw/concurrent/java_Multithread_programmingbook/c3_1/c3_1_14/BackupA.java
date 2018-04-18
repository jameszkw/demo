package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_14;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-12 下午 9:19
 **/

public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
