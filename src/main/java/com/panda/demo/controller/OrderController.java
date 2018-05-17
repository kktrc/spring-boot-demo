package com.panda.demo.controller;

import com.panda.demo.dataobject.UserDO;
import com.panda.demo.mapper.OrderMapper;
import com.panda.demo.mapper.UserMapper;
import com.panda.demo.queryobject.OrderQuery;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/test")
    public Object test() {

        return orderMapper.selectAll();
    }

    @RequestMapping(value = "/selectById")
    public Object selectById() {

        OrderQuery query = new OrderQuery();
        query.setId(10257L);

        UserDO userDO = new UserDO();
        return orderMapper.selectById(query);
    }

    @RequestMapping(value = "/insertUser")
    public Object insertUser() {

        UserDO userDO = new UserDO();
        userDO.setUserNo("sxx");
        userDO.setUserName("xxxxx");
        userDO.setNickName("xxxxxx");
        userDO.setUserSex(1);
        userDO.setPassword("xxxx");
        userDO.setMobile("111111111111");
        userDO.setCreator("xxxx");
        userDO.setAddTime(new Date());
        userDO.setModifier("xxxx");
        userDO.setUpdateTime(new Date());
        userDO.setIsDeleted(false);


        for (int i = 0; i < 1000; i++) {
            userMapper.saveUser(userDO);
        }
        return 0;
    }



    @GetMapping(value = "/getUser")
    public Object getUser() {

        return userMapper.selectAll();
    }
}
