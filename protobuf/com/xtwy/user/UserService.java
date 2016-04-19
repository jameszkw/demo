package com.xtwy.user;

import com.xtwy.pb.PbClient;
import com.xtwy.pb.RequestMsgProtobuf.*;
import com.xtwy.pb.UserProtobuf.*;
import com.zkw.exception.exloss.ExceptionA;

/**
 * Created by Administrator on 2016/4/18 0018.
 */
public class UserService {

    public User save() throws Exception{
        User.Builder user = User.newBuilder();
        user.setId(1);
        user.setPhone("13899097789");
        user.setUsername("张三的歌");

        RequestMsg.Builder requestMsg = RequestMsg.newBuilder();
        requestMsg.setCmd("saveuser");
        requestMsg.setRequestParam(user.build().toByteString());
        return (User)PbClient.startClient(requestMsg);
    }
}
