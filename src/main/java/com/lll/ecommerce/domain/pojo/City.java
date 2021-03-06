package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 城市
 * @author 
 */
@Data
public class City implements Serializable {
    private Long id;

    private String province;

    private String city;

    private static final long serialVersionUID = 1L;
}