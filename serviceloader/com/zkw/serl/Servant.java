package com.zkw.serl;

import java.io.File;
import java.io.IOException;
import java.util.ServiceLoader;

/**
 * Created by Administrator on 2016/5/23 0023.
 */
public class Servant {
    public static void main(String[] args) throws IOException {
        ServiceLoader<IPersonalServant> servantLoader = ServiceLoader.load(IPersonalServant.class);
        IPersonalServant i = null;
        for (IPersonalServant ii : servantLoader){
            if (ii.can("fetch tea"))
                i = ii;
        }

        if (i == null)
            throw new IllegalArgumentException("No suitable servant found");
        for (String arg : args){
            i.process(new File(arg));
        }
    }
}
