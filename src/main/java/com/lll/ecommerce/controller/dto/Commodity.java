package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品
 * @author 
 */
@Data
public class Commodity implements Serializable {
    private Long id;

    private String name;

    private String description;

    private String picture;

    private Long commodityCategoriesId;

    private Long priceId;

    private Long shopId;

    private static final long serialVersionUID = 1L;
}