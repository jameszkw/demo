package com.zkw.clonedemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/14 0014.
 */
public class CollectionClone implements Cloneable {
    Map head;
    Map body;

    public Map getHead() {
        return head;
    }

    public void setHead(Map head) {
        this.head = head;
    }

    public Map getBody() {
        return body;
    }

    public void setBody(Map body) {
        this.body = body;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CollectionClone clone = new CollectionClone();
        Map newBody = new HashMap();
        newBody.putAll(this.body);
        clone.setBody(newBody);
        return clone;
    }
}
