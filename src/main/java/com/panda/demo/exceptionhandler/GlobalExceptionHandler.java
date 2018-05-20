package com.panda.demo.exceptionhandler;

import com.panda.demo.bean.BaseResult;
import com.panda.demo.exception.NotLoginException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = NotLoginException.class)
    @ResponseBody
    public BaseResult notLogin(HttpServletRequest req, NotLoginException e) {

        BaseResult baseResult = new BaseResult();
        baseResult.setCode(403);
        baseResult.setMessage("未登录");
        return baseResult;
    }
}
