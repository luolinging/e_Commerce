package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.OrderCommodityDao;
import com.lll.ecommerce.domain.pojo.OrderCommodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: LuoLing
 * @date: 2020/10/6  0:27
 */
@Service
public class OrderCommodityService {

    @Autowired
    private OrderCommodityDao orderCommodityDao;

    public List<OrderCommodity> selectByCommodityId(Long commodityId){
        return orderCommodityDao.selectByCommodityId(commodityId);
    }
}
