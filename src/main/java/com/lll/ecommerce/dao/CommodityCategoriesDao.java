package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.CommodityCategories;

public interface CommodityCategoriesDao {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityCategories record);

    int insertSelective(CommodityCategories record);

    CommodityCategories selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityCategories record);

    int updateByPrimaryKey(CommodityCategories record);
}