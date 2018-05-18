package com.panda.demo.dataobject;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class OrderDO extends BaseDO implements Serializable {

    private Long userId;
    private String account;
    private Date bookTime;
    private Integer bookDuration;
    private Date bookEndTime;
    private String bookUserName;
    private String bookMobile;

}
