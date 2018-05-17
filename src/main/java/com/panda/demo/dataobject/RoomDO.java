package com.panda.demo.dataobject;

import java.io.Serializable;
import lombok.Data;

@Data
public class RoomDO extends BaseDO implements Serializable {


    private Long shopId;
}
