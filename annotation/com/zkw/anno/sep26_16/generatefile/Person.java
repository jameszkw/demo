package com.zkw.anno.sep26_16.generatefile;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeProvider;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
@Persistent(table = "person_inf")
public class Person {
    @Id(column = "person_id",type = "integer",generator = "identity")
    private int id;
    @Property(column = "person_name",type = "string")
    private String name;
    @Property(column = "Person_age",type = "integer")
    private int age;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
