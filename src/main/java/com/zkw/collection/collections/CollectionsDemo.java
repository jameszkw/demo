package com.zkw.collection.collections;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Administrator on 2016/7/6 0006.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<String> stringOfNumbers = Arrays.asList("1", "2", "3", "4");
        Collection<Integer> intNums = CollectionUtils.collect(stringOfNumbers, new Transformer() {
            public Object transform(Object o) {
                System.out.println(o);
                return Integer.valueOf((String) o);
            }
        });

        CollectionUtils.forAllDo(intNums,PrintIt.getInstance());
    }


}
