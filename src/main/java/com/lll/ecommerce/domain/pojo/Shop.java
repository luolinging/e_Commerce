package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 店铺
 * @author 
 */
@Data
public class Shop {
    private Long id;

    private String name;

    private String description;

    private Long businessId;

}