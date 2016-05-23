package com.zkw.serl;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/5/23 0023.
 */
public class Jeeves implements IPersonalServant {
    public void process(File f) throws IOException {
        System.out.println("Very good, sir.");
    }

    public boolean can(String command) {
        if (command.equals("fetch tea"))
            return true;
        else
            return false;
    }
}
