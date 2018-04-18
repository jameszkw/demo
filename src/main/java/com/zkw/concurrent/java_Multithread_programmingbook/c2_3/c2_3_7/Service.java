package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:57
 **/

public class Service {
    private boolean isConti=true;
    public void runMethod(){
        while (isConti==true){

        }
    }

    public void stop(){
        isConti=false;
    }
}
