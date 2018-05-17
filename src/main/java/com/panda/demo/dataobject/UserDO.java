package com.panda.demo.dataobject;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserDO extends BaseDO implements Serializable {

    private String userNo;

    private String userName;

    private String nickName;

    private Integer userSex;

    private String password;

    private String mobile;
}
