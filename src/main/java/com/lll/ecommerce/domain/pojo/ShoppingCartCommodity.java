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

    private String addCount;

    private Long buyerId;

    private Long businessId;

    private Boolean purchaseNow;

}