package com.zkw.test;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-19 上午10:39:18
 *
 */
public class LocalService implements IService{
    public String sayHello() {   
        return "Hello Local!!";   
    }   
   
    public String getScheme() {
        return "local";   
    }   
}
