package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 库存
 * @author 
 */
@Data
public class Inventory {
    private Long id;

    private Integer allInventoryAmount;

    private Integer preemptInventory;

    private Integer inTransitInventory;

    private Integer availableInventory;

    private Long commodityId;

    private Long storehouseId;

}