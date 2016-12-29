package com.zkw.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
@XmlRootElement(name = "hotel")
public class Hotel {
    int id;
    String name;
    List<RoomTypeVO> roomTypeVOs = new ArrayList<RoomTypeVO>();

    @XmlElementWrapper(name = "RoomTypeVOs")
    @XmlElement(name = "RoomTypeVO")
    public List<RoomTypeVO> getRoomTypeVOs() {
        return roomTypeVOs;
    }

    public void setRoomTypeVOs(List<RoomTypeVO> roomTypeVOs) {
        this.roomTypeVOs = roomTypeVOs;
    }

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
