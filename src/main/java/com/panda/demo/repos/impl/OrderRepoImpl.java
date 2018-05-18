package com.panda.demo.repos.impl;

import com.panda.demo.dataobject.OrderDO;
import com.panda.demo.dto.OrderDto;
import com.panda.demo.mapper.OrderMapper;
import com.panda.demo.queryobject.OrderQuery;
import com.panda.demo.repos.OrderRepo;
import com.panda.demo.util.BeanUtils;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class OrderRepoImpl implements OrderRepo {

    @Resource
    private OrderMapper orderMapper;


    /**
     * 保存订单
     *
     * @return Id
     */
    @Override public Long saveOrder(OrderDto dto) {

        OrderDO order = new OrderDO();
        BeanUtils.copyProperties(dto, order);
        return 0L;
    }

    /**
     * 查询订单
     */
    @Override public List<OrderDto> queryOrder(OrderQuery query) {
        return null;
    }
}
