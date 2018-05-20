package com.panda.demo.dataobject;

import lombok.Data;

@Data
public class EmployeeDO extends BaseDO {

    private String token;
    private String userName;
    private String password;
    private String name;
    private String nickName;
    private String mobile;
}
