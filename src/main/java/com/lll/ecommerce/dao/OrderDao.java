package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Order;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface OrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}