package com.zkw.de1.spi.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<SpiService> loader = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iterator = loader.iterator();
        while (iterator.hasNext()) {
            SpiService curSearch = iterator.next();
            System.out.println(curSearch.describe());
        }
    }
}
