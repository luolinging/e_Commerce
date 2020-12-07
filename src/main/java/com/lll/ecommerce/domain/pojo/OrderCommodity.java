package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * order_commodity
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

    private Integer evaluated;

    private static final long serialVersionUID = 1L;
}