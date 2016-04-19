package com.xtwy.user;

import com.xtwy.media.Remote;
import com.xtwy.pb.UserProtobuf;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
@Controller
public class UserController {

    @Remote("saveUser")
    public Object saveUser(UserProtobuf.User user){
        //使用mybatis把user数据插入到数据库
        UserProtobuf.User.Builder newUser = user.toBuilder().setPhone("123456");
        newUser.setId(12);
        newUser.setUsername("ssss");
        return newUser.build();
    }
}
