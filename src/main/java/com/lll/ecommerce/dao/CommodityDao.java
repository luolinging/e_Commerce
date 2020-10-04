package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Commodity;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface CommodityDao {
    int deleteByPrimaryKey(Long id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}