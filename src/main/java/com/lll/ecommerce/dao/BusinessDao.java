package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Business;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface BusinessDao {
    int deleteByPrimaryKey(Long id);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}