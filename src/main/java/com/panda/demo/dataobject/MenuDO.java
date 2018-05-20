package com.panda.demo.dataobject;

import lombok.Data;

@Data
public class MenuDO extends BaseDO {

    private Long parentId;
    private String title;
    private String remark;
    private String link;
    private String icon;
}
