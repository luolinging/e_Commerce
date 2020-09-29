package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 买家
 * @author 
 */
@Data
public class Buyer {
    private Long id;

    private String realName;

    private String idCard;

    private String phone;

    private String email;
}