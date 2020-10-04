package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Storehouse;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface StorehouseDao {
    int deleteByPrimaryKey(Long id);

    int insert(Storehouse record);

    int insertSelective(Storehouse record);

    Storehouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Storehouse record);

    int updateByPrimaryKey(Storehouse record);
}