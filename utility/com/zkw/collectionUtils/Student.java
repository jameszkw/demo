package com.zkw.collectionUtils;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class Student {
    private String name;

    private ArrayList<String> courses;

    public Student(String name, ArrayList<String> courses)
    {
        this.name = name;
        this.courses = courses;
    }

    public ArrayList<String> getCourses()
    {
        return courses;
    }

    public void setCourses(ArrayList<String> courses)
    {
        this.courses = courses;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
