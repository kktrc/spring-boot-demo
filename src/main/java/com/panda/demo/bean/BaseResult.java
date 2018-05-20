package com.panda.demo.bean;

import lombok.Data;

@Data
public class BaseResult {


    public BaseResult(Object result) {
        this.result = result;
    }

    public BaseResult() {

    }
    private Integer code;
    private String message;
    private Object result;
}
