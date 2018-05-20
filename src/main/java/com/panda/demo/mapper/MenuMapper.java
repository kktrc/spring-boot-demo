package com.panda.demo.mapper;

import com.panda.demo.dataobject.MenuDO;
import com.panda.demo.queryobject.MenuQuery;
import java.util.List;

public interface MenuMapper {



    int saveMenuDO(MenuDO menuDO);



    List<MenuDO> selectByQuery(MenuQuery query);
}
