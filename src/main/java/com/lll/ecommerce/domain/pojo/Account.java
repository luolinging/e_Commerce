package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 账户
 * @author 
 */
@Data
public class Account {
    private Long id;

    private String registerChannels;

    private String password;

    private String code;

    private Long userId;

    private String type;
}