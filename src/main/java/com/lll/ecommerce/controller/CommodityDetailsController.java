package com.lll.ecommerce.controller;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.lll.ecommerce.common.Result;
import com.lll.ecommerce.controller.dto.CommodityInventoryPriceDTO;
import com.lll.ecommerce.domain.pojo.*;
import com.lll.ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author luoling
 *
 * 需求是 获得一个商品详情页
 */
@Controller
@Validated
public class CommodityDetailsController {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private PriceService priceService;

    @Autowired
    private CityService cityService;

    @Autowired
    private StorehouseService storehouseService;

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private OrderCommodityService orderCommodityService;

    @Autowired
    private EvaluateService evaluateService;
    /**
     * 第一个接口（商品 + 库存 + 价格）：
     *      入参：商品id，城市id
     *      出参：一个新的类
     *          商品名，商品描述，商品图片，价格（商品+城市查出来），
     *          发货城市，库存（城市查出来所有的仓，商品加仓，查出来所有的库存求和返回）
     */
    @RequestMapping(value = "commodityInventoryPrice",method = RequestMethod.GET)
    public @ResponseBody Result<CommodityInventoryPriceDTO> commodityInventoryPrice(@NotNull(message = "商品id不能为空") Long commodityId
            , @NotNull(message = "城市id不能为空") Long cityId){

        // 1.使用商品id 去商品表中查询：获取 商品名，商品描述，商品图片
        Commodity commodity = commodityService.selectById(commodityId);
        String commodityName = commodity.getName();
        String commodityDescription = commodity.getDescription();
        String commodityPicture = commodity.getPicture();
        // 2.使用商品id + 城市id 去价格表中查询 价格
        Double price = priceService.selectByCommodityIdAndCityId(commodityId, cityId);
        // 3.使用城市id去城市表中查询 省，市，然后组成成一个 “城市名”
        City city = cityService.selectById(cityId);
        String cityName = city.getProvince() + city.getCity();
        // 4.使用城市id去仓库表中查询，得到一组仓库表记录（包含多个仓库id）
        List<Storehouse> storehouseList = storehouseService.selectByCityId(cityId);
        int availableInventory = 0;
        for (Storehouse storehouse : storehouseList) {
            // 5.使用商品id + 每一个仓库id 去库存表中查询 该商品在不同的仓库中的可售库存数，
            //   然后将不同的仓库的可售库存数加在一起求和，返回一个 总可售库存
            Long storehouseId = storehouse.getId();
            availableInventory += inventoryService.selectByCommodityIdAndStorehouseId(commodityId, storehouseId);
        }
        CommodityInventoryPriceDTO commodityInventoryPriceDTO = new CommodityInventoryPriceDTO();
        commodityInventoryPriceDTO.setCommodityName(commodityName);
        commodityInventoryPriceDTO.setCommodityDescription(commodityDescription);
        commodityInventoryPriceDTO.setCommodityPicture(commodityPicture);
        commodityInventoryPriceDTO.setCommodityPrice(price);
        commodityInventoryPriceDTO.setDeliverCity(cityName);
        commodityInventoryPriceDTO.setAvailableInventory(availableInventory);

        return Result.wrapSuccessResult(commodityInventoryPriceDTO);
    }


    /**
     * 第二个接口（评价）：在商品详情页，查询过往买过这个商品的人对这个商品的评价
     *      入参：商品id
     *      出参：一个评价对象
     *
     *          Select * from 订单商品表 where goods_id = 123
     *          能查出来一堆订单商品
     *          再拿这一堆订单商品去评价表里查
     *          能查到一堆评价
     *          每个订单商品可能有评价可能没有
     *
     *      从多的一方到一的一方，能明确找到一条记录，从一的一方找多的一方能找到很多
     *
     * 问题：给你一个订单商品，如何在不查询评价表的情况下，知道它有没有评价
     *      在订单商品表上加个标识，是否已评价
     *      赋值为 0 或 1
     *      为1的时候就是已评价
     *      什么时候从0到1呢
     *      自然是评价的时候
     */
    @RequestMapping(value = "getEvaluate",method = RequestMethod.GET)
    public @ResponseBody Result<List<Evaluate>> getEvaluate(@NotNull(message = "商品id不能为空") Long commodityId){
        // 1.根据商品id 去订单商品表中查询 多条订单商品记录 ，拿到多个订单商品id
        List<OrderCommodity> orderCommodityList = orderCommodityService.selectByCommodityId(commodityId);
        List<Evaluate> evaluates = Lists.newArrayList();
        // 遍历订单商品记录，拿到每一个订单商品id
        for (OrderCommodity orderCommodity : orderCommodityList) {
            Long orderCommodityId = orderCommodity.getId();
            // 在去查询评价表前，先判断 该订单商品有没有被评价，未被评价，不需要去查评价表；直接跳到下一个订单商品
            if(orderCommodity.getEvaluated() == 0){
                continue;
            }
            // 2.根据 每一个订单商品id，去评价表中查询 多条评价记录。一个订单商品id对应多条评价记录；最后将所有的订单商品id的评价记录合并，返回
            List<Evaluate> evaluateList = evaluateService.selectByOrderCommodityId(orderCommodityId);
            if(CollectionUtils.isEmpty(evaluateList)){
                continue;
            }
            for (Evaluate evaluate : evaluateList) {
                evaluates.add(evaluate);
            }
        }
        return Result.wrapSuccessResult(evaluates);
    }

    @RequestMapping
    public void test1(){
        // 罗玲玲
    }

    @RequestMapping
    public void whTest(){
        //王昊的测试方法
    }

}
