package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.ShoppingCartCommodityDao;
import com.lll.ecommerce.domain.pojo.ShoppingCartCommodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoling
 * @date 2020/10/29 12:09
 */
@Service
public class ShoppingCartCommodityService {

    @Autowired
    ShoppingCartCommodityDao shoppingCartCommodityDao;

    public ShoppingCartCommodity selectByPrimaryKey(Long shoppingCartCommodityId) {
        return shoppingCartCommodityDao.selectByPrimaryKey(shoppingCartCommodityId);
    }
}
