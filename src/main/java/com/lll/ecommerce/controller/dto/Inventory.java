package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 库存
 * @author 
 */
@Data
public class Inventory implements Serializable {
    private Long id;

    private Integer allInventoryAmount;

    private Integer preemptInventory;

    private Integer inTransitInventory;

    private Integer availableInventory;

    private Long commodityId;

    private Long storehouseId;

    private static final long serialVersionUID = 1L;
}