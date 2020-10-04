package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.BusinessDeliveryMethod;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface BusinessDeliveryMethodDao {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessDeliveryMethod record);

    int insertSelective(BusinessDeliveryMethod record);

    BusinessDeliveryMethod selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessDeliveryMethod record);

    int updateByPrimaryKey(BusinessDeliveryMethod record);
}