package com.panda.demo.dataobject;

import java.io.Serializable;
import lombok.Data;

@Data
public class ShopDO extends BaseDO implements Serializable {

    private Long brandId;
    private String name;
    private Double lat;
    private Double lng;
}
