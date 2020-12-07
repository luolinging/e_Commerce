package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.ShopDao;
import com.lll.ecommerce.domain.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoling
 * @date 2020/10/29 12:21
 */
@Service
public class ShopService {
    @Autowired
    ShopDao shopDao;

    public Shop selectByPrimaryKey(Long shopId) {
        return shopDao.selectByPrimaryKey(shopId);
    }
}
