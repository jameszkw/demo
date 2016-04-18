package com.xtwy;

import com.xtwy.pb.RequestMsgProtobuf.*;
import com.xtwy.pb.UserProtobuf.*;

/**
 * Created by Administrator on 2016/4/18 0018.
 */
public class UserService {

    public void save(){
        User.Builder user = User.newBuilder();
        user.setId(1);
        user.setPhone("13899097789");
        user.setUsername("张三的歌");

        RequestMsg.Builder requestMsg = RequestMsg.newBuilder();
        requestMsg.setCmd("saveuser");
        requestMsg.setRequestParam(user.getUsernameBytes());

//        requestMsg

    }
}
