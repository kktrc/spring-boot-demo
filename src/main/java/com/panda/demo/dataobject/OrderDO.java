package com.panda.demo.dataobject;

import java.io.Serializable;
import lombok.Data;

@Data
public class OrderDO extends BaseDO implements Serializable {


    private String account;
}
