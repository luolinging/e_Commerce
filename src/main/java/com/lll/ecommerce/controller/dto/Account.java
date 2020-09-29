package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 账户
 * @author 
 */
@Data
public class Account implements Serializable {
    private Long id;

    private String registerChannels;

    private String password;

    private String code;

    private Long userId;

    private String type;

    private static final long serialVersionUID = 1L;
}