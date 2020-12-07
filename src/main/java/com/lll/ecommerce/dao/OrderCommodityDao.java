package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.OrderCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface OrderCommodityDao {
    int deleteByPrimaryKey(Long id);

    int insert(OrderCommodity record);

    int insertSelective(OrderCommodity record);

    OrderCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCommodity record);

    int updateByPrimaryKey(OrderCommodity record);

    List<OrderCommodity> selectByCommodityId(Long commodityId);
}