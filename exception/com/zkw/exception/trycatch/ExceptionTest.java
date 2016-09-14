package com.zkw.exception.trycatch;

import com.zkw.exception.exloss.ExceptionA;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2016/7/29 0029.
 */
public class ExceptionTest {
    private final static Log log = LogFactory.getLog(ExceptionTest.class);
    private void test() throws Exception{
        System.out.println(StringUtils.isNumeric("-0"));
        String str=null;
        System.out.println(StringUtils.isEmpty(str));
    }
    public static void main(String[] args) {
        ExceptionTest test=new ExceptionTest();
        try {
            test.test();
        } catch (Exception e) {
            log.error("错误"+e.getMessage());
            e.printStackTrace();
        }
    }
}
