package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * commodity
 * @author 
 */
@Data
public class Commodity implements Serializable {
    private Long id;

    private String name;

    private String description;

    private String picture;

    private Long commodityCategoriesId;

    private Long shopId;

    private static final long serialVersionUID = 1L;
}