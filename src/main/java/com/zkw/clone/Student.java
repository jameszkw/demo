package com.zkw.clone;

/**
 * Created by Administrator on 2016/9/14 0014.
 */
public class Student implements Cloneable {
    String name;
    int age;
    Professor p;

    Student(String name, int age, Professor p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    public Object clone() {
        Student o = null;
        try {
            o = (Student) super.clone();
            o.p = (Professor) p.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}
