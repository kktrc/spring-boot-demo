package com.panda.demo.repos.impl;

import com.panda.demo.dataobject.UserDO;
import com.panda.demo.dto.UserDto;
import com.panda.demo.exception.DaoException;
import com.panda.demo.mapper.UserMapper;
import com.panda.demo.repos.UserRepo;
import com.panda.demo.util.BeanUtils;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class UserRepoImpl implements UserRepo {


    @Resource
    private UserMapper userMapper;


    @Override public Long saveUser(UserDto dto) {

        if (StringUtils.isBlank(dto.getCreator())
            || StringUtils.isBlank(dto.getModifier())) {
            throw new DaoException("创建者和更新者不能为空");
        }
        UserDO user = new UserDO();
        BeanUtils.copyProperties(dto, user);
        userMapper.saveUser(user);
        return user.getId();
    }
}
