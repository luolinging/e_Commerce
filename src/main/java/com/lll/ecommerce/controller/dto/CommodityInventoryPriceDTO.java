package com.lll.ecommerce.controller.dto;

import lombok.Data;

/**
 * @author: LuoLing
 * @date: 2020/10/5  1:31
 *
 * 接口CommodityInventoryPrice的返回值
 */
@Data
public class CommodityInventoryPriceDTO {
    private String commodityName;
    private String commodityDescription;
    private String commodityPicture;
    private Double commodityPrice;
    private String deliverCity;
    private Integer availableInventory;
}
