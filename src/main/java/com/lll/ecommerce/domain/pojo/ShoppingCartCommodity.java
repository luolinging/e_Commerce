package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 购物车商品表
 * @author 
 */
@Data
public class ShoppingCartCommodity {
    private Long id;

    private Integer addCount;

    private Long buyerId;

    private Long commodityId;

    private Boolean purchaseNow;

}