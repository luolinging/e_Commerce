package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.ShoppingCartCommodity;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface ShoppingCartCommodityDao {
    int deleteByPrimaryKey(Long id);

    int insert(ShoppingCartCommodity record);

    int insertSelective(ShoppingCartCommodity record);

    ShoppingCartCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartCommodity record);

    int updateByPrimaryKey(ShoppingCartCommodity record);
}