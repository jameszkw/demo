package com.xtwy.nio;

import com.zkw.nio.xtwy.nio.ByteBufferDemo;
import org.junit.Test;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class ByteBufferTest {
    @Test
    public void testByteBufferRW(){
        ByteBufferDemo.readFile("src/main/resources/bytebuffer.txt");
    }
}
