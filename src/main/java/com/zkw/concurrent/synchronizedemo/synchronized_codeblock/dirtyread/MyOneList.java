package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.dirtyread;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:54
 **/

public class MyOneList {
    private List list=new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }
}
