package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单
 * @author 
 */
@Data
public class Order {
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

}