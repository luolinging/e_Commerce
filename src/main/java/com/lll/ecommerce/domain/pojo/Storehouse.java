package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 仓库
 * @author 
 */
@Data
public class Storehouse {
    private Long id;

    private String address;

    private String name;

    private String adminName;

    private String adminPhone;

    private Long cityId;

}