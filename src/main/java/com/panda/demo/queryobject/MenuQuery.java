package com.panda.demo.queryobject;

import com.panda.demo.dataobject.MenuDO;
import java.util.List;
import lombok.Data;

@Data
public class MenuQuery extends MenuDO {

    private List<String> sorted;
}
