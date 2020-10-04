package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.OrderCommodity;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface OrderCommodityDao {
    int deleteByPrimaryKey(Long id);

    int insert(OrderCommodity record);

    int insertSelective(OrderCommodity record);

    OrderCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCommodity record);

    int updateByPrimaryKey(OrderCommodity record);
}