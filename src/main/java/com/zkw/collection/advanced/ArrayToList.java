package com.zkw.collection.advanced;

import java.util.*;

/**
 * Created by Administrator on 2016/5/11 0011.
 * 数组转换为list
 */
public class ArrayToList {

    private void arrayToList(){
        String[] strs = new String[3];
        // This gives us nothing good
        System.out.println(strs);
        // Convert strs to a List of String
        List<String> argList = Arrays.asList(strs);
        // Print them out
        System.out.println(argList);

        //返回的 List 是不可修改的，所以如果尝试向其中添加新元素将抛出一个 UnsupportedOperationException。
        argList.add("ddd");
    }

    private void addRemoveAll(){
        List<Integer> list = new ArrayList<Integer>();
        Map<String,String> map = new HashMap<String, String>();
        Set<String> set = new HashSet<String>();

    }

    private static void collectionsDemo(){
        List list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        collectionsDemo();
    }

}
