package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 城市
 * @author 
 */
@Data
public class City implements Serializable {
    private Long id;

    private String province;

    private String city;

    private static final long serialVersionUID = 1L;
}