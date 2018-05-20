package com.panda.demo.dto;

import java.util.List;
import lombok.Data;

@Data
public class MenuDto {

    private String title;
    private String remark;
    private String link;
    private String icon;

    private List<MenuDto> subs;
}
