package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 订单商品表
 * @author 
 */
@Data
public class OrderCommodity {
    private Long id;

    private Double realPayPrice;

    private Double originalPrice;

    private Double discountsValue;

    private Long orderId;

    private Long commodityId;

}