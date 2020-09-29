package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 店铺
 * @author 
 */
@Data
public class Shop implements Serializable {
    private Long id;

    private String name;

    private String description;

    private Long businessId;

    private static final long serialVersionUID = 1L;
}