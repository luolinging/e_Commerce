package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 地址
 * @author 
 */
@Data
public class Address implements Serializable {
    private Long id;

    private String province;

    private String city;

    private String district;

    private String detailedAddress;

    private Long buyerId;

    private Long businessId;

    private static final long serialVersionUID = 1L;
}