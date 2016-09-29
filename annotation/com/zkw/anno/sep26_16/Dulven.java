package com.zkw.anno.sep26_16;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class Dulven {

    private static void test1(){
        try {
            Annotation[] annotations = Class.forName("com.zkw.anno.sep26_16.Dulven").getMethod("toPerson").getAnnotations();
            for (Annotation annotation : annotations){
                System.out.println("annotation: "+annotation);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test2(){
        try {
            Annotation[] annotations = Class.forName("com.zkw.anno.sep26_16.Dulven").getMethod("toPerson").getAnnotations();
            for (Annotation annotation : annotations){
                if (annotation instanceof Param){
                    System.out.println("annotation content :"+annotation);
                    Param param = (Param)annotation;
                    System.out.println("id:"+param.id()+",name:"+param.name()+",sex:"+param.sex());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test1();
        test2();
    }


    @Param(id = 1001,name = "小张")
    public void toPerson() { }
}
