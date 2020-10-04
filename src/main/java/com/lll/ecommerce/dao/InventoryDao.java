package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Inventory;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface InventoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}