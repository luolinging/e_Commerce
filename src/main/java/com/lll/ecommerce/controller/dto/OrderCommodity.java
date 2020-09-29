package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单商品表
 * @author 
 */
@Data
public class OrderCommodity implements Serializable {
    private Long id;

    private Double realPayPrice;

    private Double originalPrice;

    private Double discountsValue;

    private Long orderId;

    private Long commodityId;

    private static final long serialVersionUID = 1L;
}