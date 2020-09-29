package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Account;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Repository
public interface AccountDao {
    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}