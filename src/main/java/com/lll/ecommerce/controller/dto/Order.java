package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 * @author 
 */
@Data
public class Order implements Serializable {
    private Long id;

    private Double originalPrice;

    private Double payMoney;

    private Double discountsMoney;

    private Date orderTime;

    private Date deliveryTime;

    private String orderStatus;

    private String payStatus;

    private String deliveryStatus;

    private Long buyerId;

    private Long businessId;

    private Long addressId;

    private Long deliveryMethodId;

    private Long payMethodId;

    private static final long serialVersionUID = 1L;
}