package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.DeliveryMethod;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface DeliveryMethodDao {
    int deleteByPrimaryKey(Long id);

    int insert(DeliveryMethod record);

    int insertSelective(DeliveryMethod record);

    DeliveryMethod selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeliveryMethod record);

    int updateByPrimaryKey(DeliveryMethod record);
}