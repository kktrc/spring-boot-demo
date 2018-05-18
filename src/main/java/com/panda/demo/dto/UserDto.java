package com.panda.demo.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String userNo;

    private String userName;

    private String nickName;

    private Integer userSex;

    private String password;

    private String mobile;

    private String creator;

    private String modifier;
}
