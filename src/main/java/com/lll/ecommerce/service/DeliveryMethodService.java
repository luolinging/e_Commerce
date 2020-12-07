package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.DeliveryMethodDao;
import com.lll.ecommerce.domain.pojo.DeliveryMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoling
 * @date 2020/10/29 12:24
 */
@Service
public class DeliveryMethodService {
    @Autowired
    DeliveryMethodDao deliveryMethodDao;

    public DeliveryMethod selectByPrimaryKey(Long deliveryMethodId) {
        return deliveryMethodDao.selectByPrimaryKey(deliveryMethodId);
    }
}
