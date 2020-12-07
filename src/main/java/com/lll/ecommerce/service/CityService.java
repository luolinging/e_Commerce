package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.CityDao;
import com.lll.ecommerce.dao.PriceDao;
import com.lll.ecommerce.domain.pojo.City;
import com.lll.ecommerce.domain.pojo.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LuoLing
 * @date: 2020/10/5  23:29
 */
@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    public City selectById(Long cityId) {
        return cityDao.selectByPrimaryKey(cityId);
    }

}
