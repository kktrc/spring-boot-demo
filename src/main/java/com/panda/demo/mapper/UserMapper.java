package com.panda.demo.mapper;

import com.panda.demo.dataobject.UserDO;
import java.util.List;

public interface UserMapper {



    int saveUser(UserDO userDO);



    List<UserDO> selectAll();
}
