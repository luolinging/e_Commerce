package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 企业支付方式
 * @author 
 */
@Data
public class BusinessPayMethod implements Serializable {
    private Long id;

    private Long payMethodId;

    private Long businessId;

    private static final long serialVersionUID = 1L;
}