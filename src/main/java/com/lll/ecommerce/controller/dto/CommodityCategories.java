package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品种类
 * @author 
 */
@Data
public class CommodityCategories implements Serializable {
    private Long id;

    private String name;

    private Long shopId;

    private static final long serialVersionUID = 1L;
}