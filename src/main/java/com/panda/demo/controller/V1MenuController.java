package com.panda.demo.controller;

import com.panda.demo.bean.BaseResult;
import com.panda.demo.dataobject.MenuDO;
import com.panda.demo.dto.MenuDto;
import com.panda.demo.mapper.MenuMapper;
import com.panda.demo.queryobject.MenuQuery;
import com.panda.demo.util.BeanUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/menu")
public class V1MenuController {

    @Resource
    private MenuMapper menuMapper;


    @RequestMapping(value = "/fetchMenus", method = RequestMethod.GET)
    public BaseResult fetchMenus() {

        MenuQuery query = new MenuQuery();
        query.setParentId(0L);
        query.setSorted(Arrays.asList("sort"));
        List<MenuDO> menuList = menuMapper.selectByQuery(query);
        List<MenuDto> menuDtoList = new ArrayList<>();
        for (MenuDO menu: menuList) {
            MenuDto menuDto = new MenuDto();
            BeanUtils.copyProperties(menu, menuDto);

            MenuQuery query1 = new MenuQuery();
            query1.setParentId(menu.getId());
            List<MenuDO> subMenuList = menuMapper.selectByQuery(query1);

            List<MenuDto> subMenuDtoList = new ArrayList<>();
            for (MenuDO subMenu: subMenuList) {
                MenuDto subMenuDto = new MenuDto();
                BeanUtils.copyProperties(subMenu, subMenuDto);
                subMenuDtoList.add(subMenuDto);
            }
            menuDto.setSubs(subMenuDtoList);

            menuDtoList.add(menuDto);
        }
        return new BaseResult(menuDtoList);
    }



    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResult addMenu(@RequestBody MenuDO menu) {

        menu.setCreator("系统");
        menu.setModifier("系统");
        menuMapper.saveMenuDO(menu);

        return new BaseResult(menu);
    }



}
