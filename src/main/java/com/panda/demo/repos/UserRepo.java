package com.panda.demo.repos;

import com.panda.demo.dto.UserDto;

public interface UserRepo {



    Long saveUser(UserDto dto);
}
