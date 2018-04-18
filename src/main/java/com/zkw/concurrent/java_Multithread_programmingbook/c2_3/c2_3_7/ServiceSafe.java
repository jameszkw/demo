package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 8:07
 **/

public class ServiceSafe {
    private boolean isConti=true;
    public void runMethod(){
        String anyString=new String();
        while (isConti==true){
            synchronized (anyString){

            }
        }
        System.out.println("停下来了！");
    }
    public void stop(){
        isConti=false;
    }
}
