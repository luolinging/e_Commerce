package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.CommodityDao;
import com.lll.ecommerce.domain.pojo.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LuoLing
 * @date: 2020/10/5  22:01
 */
@Service
public class CommodityService {
    @Autowired
    private CommodityDao commodityDao;

    // 1.使用商品id 去商品表中查询：商品名，商品描述，商品图片
    public Commodity selectById(Long id) {
        return commodityDao.selectByPrimaryKey(id);
    }

    public Commodity selectByPrimaryKey(Long commodityId) {
        return commodityDao.selectByPrimaryKey(commodityId);
    }
}
