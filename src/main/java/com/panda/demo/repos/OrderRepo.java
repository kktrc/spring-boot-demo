package com.panda.demo.repos;

import com.panda.demo.dto.OrderDto;
import com.panda.demo.queryobject.OrderQuery;
import java.util.List;

public interface OrderRepo {


    /**
     *
     * 保存订单
     * @param dto
     * @return Id
     */
    Long saveOrder(OrderDto dto);


    /**
     *
     * 查询订单
     * @param query
     * @return
     */
    List<OrderDto> queryOrder(OrderQuery query);
}
