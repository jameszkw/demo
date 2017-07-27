package com.zkw.property;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/7 0007.
 */
public class Demo {
    private void change( Map<String, Object> returnMap){
        returnMap.remove("ddd");
    }
    private void change2(Person person){
    }
    private void change3(int i){
        i=1;
    }
    private void change4(Integer i){
        i=1;
    }
    public static void main(String[] args) {
        Demo demo=new Demo();
        Map<String, Object> returnMap = new HashMap<String, Object>();
        returnMap.put("ddd","ddd");
        returnMap.put("ccc","ccc");
        demo.change(returnMap);
        System.out.println(returnMap.size());
        Person person=new Person();

        demo.change2(person);

        int i=3;
        demo.change3(i);
        System.out.println(i);

        Integer e=3;
        demo.change4(e);
        System.out.println(e);
    }
}
