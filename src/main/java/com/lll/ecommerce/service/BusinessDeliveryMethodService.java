package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.BusinessDeliveryMethodDao;
import com.lll.ecommerce.domain.pojo.BusinessDeliveryMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luoling
 * @date 2020/10/29 12:23
 */
@Service
public class BusinessDeliveryMethodService {
    @Autowired
    BusinessDeliveryMethodDao businessDeliveryMethodDao;

    public List<BusinessDeliveryMethod> selectByBusinessId(Long businessId) {
        return businessDeliveryMethodDao.selectByBusinessId(businessId);
    }
}
