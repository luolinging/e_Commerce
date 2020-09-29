package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单库存预占表
 * @author 
 */
@Data
public class OrderInventoryPreempt implements Serializable {
    private Long id;

    private Integer preemptAmount;

    private String status;

    private Long orderId;

    private Long inventoryId;

    private static final long serialVersionUID = 1L;
}