package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 企业配送方式
 * @author 
 */
@Data
public class BusinessDeliveryMethod {
    private Long id;

    private Long deliveryMethodId;

    private Long businessId;
}