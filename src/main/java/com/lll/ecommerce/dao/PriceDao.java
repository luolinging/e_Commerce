package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Price;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceDao {
    int deleteByPrimaryKey(Long id);

    int insert(Price record);

    int insertSelective(Price record);

    Price selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);

    Double selectByCommodityIdAndCityId(@Param("commodityId") Long commodityId, @Param("cityId") Long cityId);
}