package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.PriceDao;
import com.lll.ecommerce.domain.pojo.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LuoLing
 * @date: 2020/10/5  23:17
 */
@Service
public class PriceService {

    @Autowired
    private PriceDao priceDao;

    public Double selectByCommodityIdAndCityId(Long commodity,Long cityId){
        return priceDao.selectByCommodityIdAndCityId(commodity,cityId);
    }
}
