package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.OrderInventoryPreempt;

public interface OrderInventoryPreemptDao {
    int deleteByPrimaryKey(Long id);

    int insert(OrderInventoryPreempt record);

    int insertSelective(OrderInventoryPreempt record);

    OrderInventoryPreempt selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInventoryPreempt record);

    int updateByPrimaryKey(OrderInventoryPreempt record);
}