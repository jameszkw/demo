package com.zkw.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class Json2Object {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(5237);
        student1.setName("jingshou");
        student1.setBirthDay(new Date());

        ObjectMapper mapper = new ObjectMapper();

        // Convert object to JSON string
        String Json = null;
        try {
            Json = mapper.writeValueAsString(student1);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Change Object to JSON String: " + Json);


        // Convert Json string to Object
        Student student2 = null;
        try {
            student2 = mapper.readValue(Json.getBytes(), Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(student2);
    }
}
