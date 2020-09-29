package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 买家
 * @author 
 */
@Data
public class Buyer implements Serializable {
    private Long id;

    private String realName;

    private String idCard;

    private String phone;

    private String email;

    private static final long serialVersionUID = 1L;
}