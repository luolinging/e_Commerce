package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 配送方式
 * @author 
 */
@Data
public class DeliveryMethod implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}