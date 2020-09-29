package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 地址
 * @author 
 */
@Data
public class Address{
    private Long id;

    private String province;

    private String city;

    private String district;

    private String detailedAddress;

    private Long buyerId;

    private Long businessId;
}