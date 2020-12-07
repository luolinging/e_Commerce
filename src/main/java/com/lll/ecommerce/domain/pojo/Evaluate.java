package com.lll.ecommerce.domain.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * evaluate
 * @author 
 */
@Data
public class Evaluate implements Serializable {
    private Long id;

    private Date evaluateTime;

    private String evaluateInfo;

    private Long buyerId;

    private Long orderCommodityId;

    private static final long serialVersionUID = 1L;
}