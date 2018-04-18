package com.zkw.protobuf.user;

import com.zkw.protobuf.pb.PbClient;
import com.zkw.protobuf.pb.RequestMsgProtobuf;
import com.zkw.protobuf.pb.UserProtobuf;

/**
 * Created by Administrator on 2016/4/18 0018.
 */
public class UserService {

    public UserProtobuf.User save() throws Exception{
        UserProtobuf.User.Builder user = UserProtobuf.User.newBuilder();
        user.setId(1);
        user.setPhone("13899097789");
        user.setUsername("张三的歌");

        RequestMsgProtobuf.RequestMsg.Builder requestMsg = RequestMsgProtobuf.RequestMsg.newBuilder();
        requestMsg.setCmd("saveuser");
        requestMsg.setRequestParam(user.build().toByteString());
        return (UserProtobuf.User) PbClient.startClient(requestMsg);
    }
}
