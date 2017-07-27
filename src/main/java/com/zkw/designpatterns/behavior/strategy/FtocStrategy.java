package com.zkw.designpatterns.behavior.observer.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-23 上午 9:21
 **/

public class FtocStrategy implements Application {
    private InputStreamReader isr;
    private BufferedReader br;
    private boolean isDone=false;


    public void init() {
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
    }

    public void idle() {
        String fahrString=readLineAndReturnNullIfError();
        if (fahrString==null||fahrString.length()==0){
            isDone=true;
        }else {
            double fahr=Double.parseDouble(fahrString);
            double celcius=5.0/9.0*(fahr-32);
            System.out.println("F="+fahr+", C="+celcius);
        }
    }

    public void cleanup() {
        System.out.println("ftoc exit");
    }

    public boolean done() {
        return isDone;
    }

    private String readLineAndReturnNullIfError(){
        String s;
        try {
            s=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            s=null;
        }
        return s;
    }


    public static void main(String[] args) {
        new ApplicationRunner(new FtocStrategy()).run();
    }
}
