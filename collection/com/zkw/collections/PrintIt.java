package com.zkw.collections;

import org.apache.commons.collections.Closure;

/**
 * Created by Administrator on 2016/7/6 0006.
 */
public class PrintIt implements Closure {
    private static PrintIt ourInstance = new PrintIt();

    public static PrintIt getInstance() {
        return ourInstance;
    }

    private PrintIt() // This is a singleton, dont change this!
    {
    }

    public void execute(Object o)
    {
        System.out.println( o.toString() );
    }
}
