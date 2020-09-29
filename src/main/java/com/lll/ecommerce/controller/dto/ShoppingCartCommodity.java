package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 购物车商品表
 * @author 
 */
@Data
public class ShoppingCartCommodity implements Serializable {
    private Long id;

    private String addCount;

    private Long buyerId;

    private Long businessId;

    private Boolean purchaseNow;

    private static final long serialVersionUID = 1L;
}