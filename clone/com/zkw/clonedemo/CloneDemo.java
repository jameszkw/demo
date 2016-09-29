package com.zkw.clonedemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/14 0014.
 */
public class CloneDemo {
    /**
     * 深度克隆
     * @throws CloneNotSupportedException
     */
    private void deepCloneTest() throws CloneNotSupportedException {
        long t1 = System.currentTimeMillis();
        Professor p = new Professor("wangwu", 50);
        Student s1 = new Student("zhangsan", 18, p);
        Student s2 = (Student) s1.clone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);// 学生1的教授不改变。
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }
    /**
     * 深度克隆-序列化方法，此方法耗时比重新clone()方法时间长
     * @throws CloneNotSupportedException
     */
    private void deepCloneTestSerial() throws IOException, ClassNotFoundException {
        long t1 = System.currentTimeMillis();
        Professor2 p = new Professor2("wangwu", 50);
        Student2 s1 = new Student2("zhangsan", 18, p);
        Student2 s2 = (Student2) s1.deepClone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age); // 学生1的教授不改变。
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
    /**
     * 浅度克隆
     * @throws CloneNotSupportedException
     */
    private void shallowCloneTest(){
        Professor0 p = new Professor0("wangwu", 50);
        Student0 s1 = new Student0("zhangsan", 18, p);
        Student0 s2 = (Student0) s1.clone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        s2.name = "z";
        s2.age = 45;
        System.out.println("学生s1的姓名：" + s1.name + "\n学生s1教授的姓名：" + s1.p.name + "," + "\n学生s1教授的年纪" + s1.p.age);// 学生1的教授
    }

    /**
     * 集合克隆
     * @throws CloneNotSupportedException
     */
    private void collectionClone() throws CloneNotSupportedException {
        CollectionClone collectionClone = new CollectionClone();
        Map map = new HashMap();
        map.put("key1","v1");
        map.put("key2","v2");
        map.put("key3","v3");
        collectionClone.setBody(map);
        CollectionClone collectionClone1 = (CollectionClone)collectionClone.clone();
        collectionClone1.getBody().put("key1","value1");
        System.out.println(collectionClone.getBody().get("key1"));
        System.out.println(collectionClone1.getBody().get("key1"));

    }



    public static void main(String[] args) {
        CloneDemo cloneDemo = new CloneDemo();

//        cloneDemo.shallowCloneTest();

        /*try {
            cloneDemo.deepCloneTest();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

        /*try {
            cloneDemo.deepCloneTestSerial();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            cloneDemo.collectionClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
