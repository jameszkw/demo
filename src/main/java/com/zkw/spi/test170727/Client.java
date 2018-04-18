package com.zkw.spi.test170727;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-27 下午 4:08
 **/

public class Client {
    public static void main(String[] args) {
        ServiceLoader loader = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = loader.iterator();
        while (iterator.hasNext()){
            Search search = iterator.next();
            search.search();
        }

    }
}
