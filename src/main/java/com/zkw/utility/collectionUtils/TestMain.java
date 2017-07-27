package com.zkw.utility.collectionUtils;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class TestMain {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("001");
        list.add("002");
        Student s = new Student("Tom", list);
        ArrayList<String> anotherList = s.getCourses();
        anotherList.add("999");
        System.out.println("Tom's course.length = " + s.getCourses().size());
    }
}
