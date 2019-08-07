package com.hisun.app.service;

import com.hisun.app.pojo.Orders;

/**
 * Created by TAO on 2019-07-15.
 */
public interface OrderService {
    public Orders query(Integer orderId);
}
