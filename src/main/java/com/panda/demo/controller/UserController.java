package com.panda.demo.controller;

import com.panda.demo.dto.UserDto;
import com.panda.demo.repos.UserRepo;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Resource
    private UserRepo userRepo;


    @RequestMapping(value = "/v1/user/add", method = RequestMethod.POST)
    public Object addUser(@RequestBody UserDto dto) {

        return userRepo.saveUser(dto);
    }
}
