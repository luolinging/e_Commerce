package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 订单库存预占表
 * @author 
 */
@Data
public class OrderInventoryPreempt {
    private Long id;

    private Integer preemptAmount;

    private String status;

    private Long orderId;

    private Long inventoryId;

}