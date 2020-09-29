package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 价格
 * @author 
 */
@Data
public class Price {
    private Long id;

    private Double price;

    private Long cityId;

}