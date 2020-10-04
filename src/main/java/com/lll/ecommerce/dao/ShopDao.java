package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Shop;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface ShopDao {
    int deleteByPrimaryKey(Long id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}