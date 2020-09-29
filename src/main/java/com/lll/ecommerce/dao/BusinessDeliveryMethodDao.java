package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.BusinessDeliveryMethod;

public interface BusinessDeliveryMethodDao {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessDeliveryMethod record);

    int insertSelective(BusinessDeliveryMethod record);

    BusinessDeliveryMethod selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessDeliveryMethod record);

    int updateByPrimaryKey(BusinessDeliveryMethod record);
}