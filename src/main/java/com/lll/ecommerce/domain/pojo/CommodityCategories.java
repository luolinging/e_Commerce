package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 商品种类
 * @author 
 */
@Data
public class CommodityCategories {
    private Long id;

    private String name;

    private Long shopId;

}