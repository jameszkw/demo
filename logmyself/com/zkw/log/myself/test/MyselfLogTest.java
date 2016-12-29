package com.zkw.log.myself.test;

import com.zkw.log.myself.Log;
import com.zkw.log.myself.LogFactory;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class MyselfLogTest {
    private static final Log log = LogFactory.getLog(MyselfLogTest.class);
    private static void justTest(){
        log.info("just test1... ...");
        log.warn("just test2... ...");
        log.error("just test3... ...");
        log.fatal("just test4... ...");
    }

    public static void main(String[] args) {
        justTest();
    }
}
