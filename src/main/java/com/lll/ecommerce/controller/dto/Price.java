package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 价格
 * @author 
 */
@Data
public class Price implements Serializable {
    private Long id;

    private Double price;

    private Long cityId;

    private static final long serialVersionUID = 1L;
}