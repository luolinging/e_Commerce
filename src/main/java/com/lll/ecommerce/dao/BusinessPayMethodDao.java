package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.BusinessPayMethod;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface BusinessPayMethodDao {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessPayMethod record);

    int insertSelective(BusinessPayMethod record);

    BusinessPayMethod selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessPayMethod record);

    int updateByPrimaryKey(BusinessPayMethod record);
}