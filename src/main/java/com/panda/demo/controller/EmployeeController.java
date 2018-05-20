package com.panda.demo.controller;

import com.panda.demo.bean.BaseResult;
import com.panda.demo.dataobject.EmployeeDO;
import com.panda.demo.mapper.EmployeeMapper;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {


    @Resource
    private EmployeeMapper employeeMapper;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResult addEmployee(@RequestBody EmployeeDO employee) {

        employeeMapper.saveEmployee(employee);
        return new BaseResult();
    }
    
}
