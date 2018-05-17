package com.panda.demo.mapper;

import com.panda.demo.dataobject.OrderDO;
import com.panda.demo.queryobject.OrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {




    @Select("select * from t_order")
    List<OrderDO> selectAll();





    OrderDO selectById(OrderQuery query);
}
