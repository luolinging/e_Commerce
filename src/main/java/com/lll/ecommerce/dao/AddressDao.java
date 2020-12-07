package com.lll.ecommerce.dao;

import com.lll.ecommerce.domain.pojo.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo
 */
@Repository
public interface AddressDao {
    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> selectByBuyerId(Long buyerId);
}