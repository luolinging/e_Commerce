package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * price
 * @author 
 */
@Data
public class Price implements Serializable {
    private Long id;

    private Double price;

    private Long cityId;

    private Long commodityId;

    private static final long serialVersionUID = 1L;
}