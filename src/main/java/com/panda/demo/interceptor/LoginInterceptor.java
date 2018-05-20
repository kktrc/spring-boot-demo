package com.panda.demo.interceptor;

import com.panda.demo.dataobject.EmployeeDO;
import com.panda.demo.exception.NotLoginException;
import com.panda.demo.mapper.EmployeeMapper;
import com.panda.demo.queryobject.EmployeeQuery;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private EmployeeMapper employeeMapper;


    @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
        Object handler) throws Exception {

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie: cookies) {
                if ("token".equals(cookie.getName())) {
                    String token = cookie.getValue();
                    EmployeeQuery query = new EmployeeQuery();
                    query.setToken(token);
                    List<EmployeeDO> users = employeeMapper.queryEmployee(query);
                    if (!users.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        throw new NotLoginException("用户未登录");
    }
}
