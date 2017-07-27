package com.zkw.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * jackson
 *
 * @author James
 * @create 2017-07-26 下午 2:44
 **/

public class JacksonTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"asdf");
        ObjectMapper mapper = new ObjectMapper();

        String json = null;
        try {
            //对象2字符串
            json = mapper.writeValueAsString(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);

        // 字符串2对象
        ObjectReader reader = mapper.reader(Map.class);
        // and then do other configuration, if any, and read:
        try {
            Map map1 = reader.readValue(json);
            System.out.println(map1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
