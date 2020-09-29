package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 企业配送方式
 * @author 
 */
@Data
public class BusinessDeliveryMethod implements Serializable {
    private Long id;

    private Long deliveryMethodId;

    private Long businessId;

    private static final long serialVersionUID = 1L;
}