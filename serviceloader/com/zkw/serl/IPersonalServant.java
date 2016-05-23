package com.zkw.serl;

/**
 * Created by Administrator on 2016/5/23 0023.
 */
public interface IPersonalServant {
    // Process a file of commands to the servant
    public void process(java.io.File f) throws java.io.IOException;
    public boolean can(String command);
}
