package com.zkw.xml.springxml;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
