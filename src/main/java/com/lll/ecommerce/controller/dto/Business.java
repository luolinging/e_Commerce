package com.lll.ecommerce.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 企业（卖家）
 * @author 
 */
@Data
public class Business implements Serializable {
    private Long id;

    private String realName;

    private String idCard;

    private String phone;

    private String email;

    private String qualificationNo;

    private static final long serialVersionUID = 1L;
}