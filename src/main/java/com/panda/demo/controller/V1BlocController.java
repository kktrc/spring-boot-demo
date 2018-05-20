package com.panda.demo.controller;

import com.panda.demo.bean.BaseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/bloc")
public class V1BlocController {


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResult addBloc() {
        return new BaseResult();
    }


}
