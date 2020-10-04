package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.PayMethod;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface PayMethodDao {
    int deleteByPrimaryKey(Long id);

    int insert(PayMethod record);

    int insertSelective(PayMethod record);

    PayMethod selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayMethod record);

    int updateByPrimaryKey(PayMethod record);
}