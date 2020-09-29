package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 仓库
 * @author 
 */
@Data
public class Storehouse implements Serializable {
    private Long id;

    private String address;

    private String name;

    private String adminName;

    private String adminPhone;

    private Long cityId;

    private static final long serialVersionUID = 1L;
}