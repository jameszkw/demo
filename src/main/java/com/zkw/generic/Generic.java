package com.zkw.generic;

/**
 * 泛型替代Object2Generic
 *
 * @author James
 * @create 2017-07-13 下午 3:06
 **/

public class Generic<AnyType> {
    AnyType obj;

    public AnyType read(){
        return obj;
    }

    public void write(AnyType x){
        obj = x;
    }

    private static void testStr(){
        Generic<String> obj = new Generic<String>();
        obj.write("3");
        String val = obj.read();
        System.out.println("Contents are: "+val);
    }

    private static void testInt(){
        Generic<Integer> obj = new Generic<Integer>();
        obj.write(1);
        int val = obj.read();
        System.out.println("Contents are: "+val);
    }

    public static void main(String[] args) {
//        testStr();
        testInt();
    }
}
