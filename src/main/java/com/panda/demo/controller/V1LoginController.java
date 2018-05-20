package com.panda.demo.controller;

import com.panda.demo.bean.BaseResult;
import com.panda.demo.dataobject.EmployeeDO;
import com.panda.demo.mapper.EmployeeMapper;
import com.panda.demo.queryobject.EmployeeQuery;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class V1LoginController {


    @Resource
    private EmployeeMapper employeeMapper;

    /**
     *
     * 登录接口
     * @param userName
     * @param password
     * @param response
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResult login(
        @RequestParam String userName,
        @RequestParam String password,
        HttpServletResponse response
    ) {

        BaseResult baseResult = new BaseResult();
        EmployeeQuery query = new EmployeeQuery();
        query.setUserName(userName);
        query.setPassword(password);

        List<EmployeeDO> users = employeeMapper.queryEmployee(query);

        if (users.isEmpty()) {
            baseResult.setCode(400);
            baseResult.setMessage("密码错误");
            return baseResult;
        }

        EmployeeDO user = users.get(0);
        Cookie cookie = new Cookie("token", user.getToken());
        cookie.setMaxAge(1000 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);

        baseResult.setCode(200);
        baseResult.setMessage("登录成功");
        return baseResult;
    }
}
