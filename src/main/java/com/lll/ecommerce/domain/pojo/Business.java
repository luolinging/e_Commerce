package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 企业（卖家）
 * @author 
 */
@Data
public class Business {
    private Long id;

    private String realName;

    private String idCard;

    private String phone;

    private String email;

    private String qualificationNo;
}