package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Buyer;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface BuyerDao {
    int deleteByPrimaryKey(Long id);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}