package com.zkw.collections;

import org.apache.commons.collections.CollectionUtils;
import org.eclipse.persistence.internal.oxm.schema.model.List;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/5 0005.
 */
public class CollectionUtilsDemo {
    private static void demo(){
        String allowIpStr = "";
        String[] allowIps = allowIpStr.split(",");
        for (String allowIP: allowIps){
            System.out.println(allowIP);
        }
    }
    public static void main(String[] args) {
        demo();
    }
}
