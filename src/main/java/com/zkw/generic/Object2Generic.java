package com.zkw.generic;

/**
 * 使用Object表示泛型
 *
 * @author James
 * @create 2017-07-13 上午 10:41
 **/

public class Object2Generic {
    Object storedValue;
    public Object read(){
        return storedValue;
    }

    public void write(Object x){
        storedValue =x;
    }


    private static void testObj2Str(){
        Object2Generic obj = new Object2Generic();
        obj.write("3");
        String val = (String)obj.read();
        System.out.println("Contents are: "+val);
    }

    private static void testObj2Int(){
        Object2Generic obj = new Object2Generic();
        obj.write(new Integer(1));
        int val = (Integer) obj.read();
        System.out.println("Contents are: "+val);
    }
    public static void main(String[] args) {
        testObj2Str();
        testObj2Int();
    }
}
