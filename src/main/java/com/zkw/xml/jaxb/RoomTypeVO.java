package com.zkw.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
public class RoomTypeVO {
    String price;
    int typeid;
    String typename;

    @XmlElement(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @XmlAttribute(name = "typeid")
    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }
    @XmlElement(name = "typename")
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
