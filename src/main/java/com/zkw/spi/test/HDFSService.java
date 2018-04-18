package com.zkw.spi.test;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-19 上午10:38:29
 *
 */
public class HDFSService implements IService{
    public String sayHello() {   
        return "Hello HDFS!!";   
    }   
   
    public String getScheme() {   
        return "hdfs";   
    }   
}
