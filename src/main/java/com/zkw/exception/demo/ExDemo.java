package com.zkw.exception.demo;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class ExDemo {
    private static void demo() throws DemoException{
        String[] strs = new String[2];
        String str = strs[2];
    }
    private static void demo2(){
        try {
            throw new DemoException();
        } catch (DemoException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch (DemoException e) {
            System.out.println("demo ex...");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.printf("demo arr ex..."+e);
        }
    }
}
