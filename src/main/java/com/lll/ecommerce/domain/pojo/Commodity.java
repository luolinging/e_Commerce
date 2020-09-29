package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 商品
 * @author 
 */
@Data
public class Commodity {
    private Long id;

    private String name;

    private String description;

    private String picture;

    private Long commodityCategoriesId;

    private Long priceId;

    private Long shopId;

}