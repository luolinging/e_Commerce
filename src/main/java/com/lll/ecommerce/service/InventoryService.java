package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.InventoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LuoLing
 * @date: 2020/10/6  0:16
 */
@Service
public class InventoryService {

    @Autowired
    private InventoryDao inventoryDao;

    public int selectByCommodityIdAndStorehouseId(Long commodityId,Long storehouseId){
        return inventoryDao.selectByCommodityIdAndStorehouseId(commodityId,storehouseId);
    }
}
