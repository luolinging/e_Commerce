package com.lll.ecommerce.service;

import com.lll.ecommerce.dao.EvaluateDao;
import com.lll.ecommerce.domain.pojo.Evaluate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: LuoLing
 * @date: 2020/10/6  0:33
 */
@Service
public class EvaluateService {

    @Autowired
    private EvaluateDao evaluateDao;

    public List<Evaluate> selectByOrderCommodityId(Long orderCommodityId){
        return evaluateDao.selectByOrderCommodityId(orderCommodityId);
    }

}
