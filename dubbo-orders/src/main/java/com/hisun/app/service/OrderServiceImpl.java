package com.hisun.app.service;

import com.hisun.app.pojo.Orders;

/**
 * Created by TAO on 2019-07-15.
 */
public class OrderServiceImpl implements OrderService{

    @Override
    public Orders query(Integer orderId) {
        Orders orders = new Orders();
        orders.setOrderId(20190715);
        if (orderId.equals(orders.getOrderId())){
            orders.setAdr("广东深圳");
            orders.setBuyName("悟空");
            orders.setGoodsName("香蕉");
            orders.setPrice(10);
        }
        return orders;
    }
}
