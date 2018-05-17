package com.panda.demo.dataobject;

import java.util.Date;
import lombok.Data;

@Data
public class BaseDO {

    private Long id;
    private String creator;
    private Date addTime;
    private String modifier;
    private Date updateTime;
    private Boolean isDeleted;
}
