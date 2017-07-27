package com.xtwy.pb;

import com.zkw.protobuf.pb.UserProtobuf;
import com.zkw.protobuf.user.UserService;
import org.junit.Test;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
public class PbTest {

    @Test
    public void testAddUser(){
        UserService userService = new UserService();
        UserProtobuf.User user = null;
        try {
            user = userService.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(user.getPhone());
    }
}
