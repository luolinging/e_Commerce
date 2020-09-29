package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 企业支付方式
 * @author 
 */
@Data
public class BusinessPayMethod {
    private Long id;

    private Long payMethodId;

    private Long businessId;

}