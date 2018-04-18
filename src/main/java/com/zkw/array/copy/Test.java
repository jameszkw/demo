package com.zkw.array.copy;

import java.util.*;

/**
 * Created by Administrator on 2016/6/15 0015.
 */
public class Test implements Comparator {
    private void com(){
        List<String> list=new ArrayList<String>();
        list.add("33");
        list.add("12");

//        list.sort();
//        Arrays.sort();
        Collections.sort(list);

        System.out.println(list);
    }
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void main(String[] args) {
      /*  Collections.sort(new ArrayList<Comparable>(),);
        ArrayList list=new ArrayList();
//        list.sort();
        String  str="";
        String str2="";
        str.compareTo(str2);*/
//        Arrays.sort();
        Test test=new Test();
        test.com();
    }
}
