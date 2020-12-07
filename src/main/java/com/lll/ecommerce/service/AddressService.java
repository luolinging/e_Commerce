package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.AddressDao;
import com.lll.ecommerce.domain.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luoling
 * @date 2020/10/29 12:07
 */
@Service
public class AddressService {

    @Autowired
    AddressDao addressDao;

    public List<Address> selectByBuyerId(Long buyerId) {
        return addressDao.selectByBuyerId(buyerId);
    }
}
