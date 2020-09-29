package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.City;

public interface CityDao {
    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}