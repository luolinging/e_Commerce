package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.StorehouseDao;
import com.lll.ecommerce.domain.pojo.Storehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: LuoLing
 * @date: 2020/10/5  23:41
 */
@Service
public class StorehouseService {

    @Autowired
    private StorehouseDao storehouseDao;

    public List<Storehouse> selectByCityId(Long cityId){
        return storehouseDao.selectByCityId(cityId);
    }
}
