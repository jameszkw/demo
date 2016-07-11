package com.zkw.collectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class Test1Main {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("001");
        list.add("002");
        Student1 s = new Student1("Tom", list);
        List<String> anotherList = s.getCourses();
        /**
         * throws java.lang.UnsupportedOperationException
         * should replace with s.addCourse(String course)
         */
        anotherList.add("999");
        // never reached
        System.out.println("Tom's course.length = " + s.getCourses().size());

    }

}
