package com.lll.ecommerce.controller.dto;

import lombok.Data;

/**
 * @author luoling
 * @date 2020/10/27 12:17
 */
@Data
public class ConfirmOrderInfoDTO {
    private String shopName;
    private String commodityPicture;
    private String commodityName;
    // 单价
    private Double commodityUnitPrice;
    private Integer commodityCount;
    // 小计
    private Double commoditySubtotal;
    // 实付款
    private Double commodityActualPayment;
    // 配送方式的名称
    private String deliveryMethodName;
}
