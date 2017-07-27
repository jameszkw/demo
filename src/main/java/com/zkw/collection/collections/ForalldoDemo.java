package com.zkw.collection.collections;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/7/6 0006.
 */
public class ForalldoDemo {
    public static void main(String[] args) {
        //数据
        List<String> emplist = new ArrayList<String>();
        emplist.add("a");
        emplist.add("b");
        emplist.add("c");

        Closure cols=new Closure(){
            public void execute(Object o) {
                System.out.println(o+" clo");
            }
        };

        //工具类
        CollectionUtils.forAllDo(emplist,cols);
        //操作后的数据
        Iterator<String> empIt = emplist.iterator();
        while(empIt.hasNext()){
            System.out.println(empIt.next());
        }
    }
}
