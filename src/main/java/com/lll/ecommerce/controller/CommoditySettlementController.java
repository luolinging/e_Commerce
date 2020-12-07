package com.lll.ecommerce.controller;

import com.lll.ecommerce.controller.dto.ConfirmOrderInfoDTO;
import com.lll.ecommerce.dao.*;
import com.lll.ecommerce.domain.pojo.*;
import com.lll.ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author luoling
 * @date 2020/10/23 10:25
 *
 * 商品结算接口
 */
@Controller
@Validated
public class CommoditySettlementController {

    @Autowired
    AddressService addressService;

    @Autowired
    ShoppingCartCommodityService shoppingCartCommodityService;

    @Autowired
    CommodityService commodityService;

    @Autowired
    ShopService shopService;

    @Autowired
    CityDao cityDao;

    @Autowired
    PriceService priceService;

    @Autowired
    BusinessDeliveryMethodService businessDeliveryMethodService;

    @Autowired
    DeliveryMethodService deliveryMethodService;

    // 1. 获取买家收货地址
    @RequestMapping(value = "getShippingAddress", method = RequestMethod.GET)
    public List<Address> getShippingAddress(@NotNull(message = "买家id不能为空") Long buyerId){
        List<Address> addressList = addressService.selectByBuyerId(buyerId);
        return addressList;
    }

    // 2. 获取买家选购商品信息，及该商品的店铺信息，配送方式
    @RequestMapping(value = "getConfirmOrderInfo", method = RequestMethod.GET)
    public ConfirmOrderInfoDTO getConfirmOrderInfo(@NotNull(message = "购物车商品id不能为空") List<Long> shoppingCartCommodityIdList,
                                                   @NotNull(message = "城市id不能为空")Long cityId){
        ConfirmOrderInfoDTO confirmOrderInfoDTO = new ConfirmOrderInfoDTO();
        Double commodityUnitPrice = 0.0;  // 商品单价
        Double commodityActualPayment = 0.0;  // 商品实付款
        for (Long shoppingCartCommodityId : shoppingCartCommodityIdList) {
            // 下面只是一个购物车商品id
            String deliveryMethodName = null;
            // 2.1 用购物车商品id，查询商品id，
            ShoppingCartCommodity shoppingCartCommodity = shoppingCartCommodityService.selectByPrimaryKey(shoppingCartCommodityId);
            Long commodityId = shoppingCartCommodity.getCommodityId();
            // 2.2 用查到的商品id，查询商品图片，商品名，店铺id
            Commodity commodity = commodityService.selectByPrimaryKey(commodityId);
            Long shopId = commodity.getShopId();
            Shop shop = shopService.selectByPrimaryKey(shopId);
            String shopName = shop.getName();
            String commodityPicture = commodity.getPicture();
            String commodityName = commodity.getName();
            commodityUnitPrice = priceService.selectByCommodityIdAndCityId(commodityId, cityId);
            // 获取商品小计 = 商品单价 - 优惠值  ，目前没有优惠这个功能，先让 商品小计 = 商品单价
            confirmOrderInfoDTO.setCommoditySubtotal(commodityUnitPrice);
            // 获取一个购物车商品id的购买数量
            Integer commodityCount = shoppingCartCommodity.getAddCount();
            // 根据企业id拿 配送方式(List)
            Long businessId = shop.getBusinessId();
            List<BusinessDeliveryMethod> businessDeliveryMethodList = businessDeliveryMethodService.selectByBusinessId(businessId);
            for (BusinessDeliveryMethod businessDeliveryMethod : businessDeliveryMethodList) {
                Long deliveryMethodId = businessDeliveryMethod.getDeliveryMethodId();
                DeliveryMethod deliveryMethod = deliveryMethodService.selectByPrimaryKey(deliveryMethodId);
                deliveryMethodName = deliveryMethod.getName(); // 拿到了配送方式的名字
            }
            confirmOrderInfoDTO.setShopName(shopName);
            confirmOrderInfoDTO.setCommodityPicture(commodityPicture);
            confirmOrderInfoDTO.setCommodityName(commodityName);
            confirmOrderInfoDTO.setCommodityCount(commodityCount);
            confirmOrderInfoDTO.setCommodityUnitPrice(commodityUnitPrice);
            confirmOrderInfoDTO.setDeliveryMethodName(deliveryMethodName);
        }
        commodityActualPayment = commodityActualPayment + commodityUnitPrice;
        confirmOrderInfoDTO.setCommodityActualPayment(commodityActualPayment);
        // 最后有一个总计  将每一个购物车商品id购买的商品数量加在一起，所有商品应付的钱，然会给一个总计
        return confirmOrderInfoDTO;
    }
}
