package com.hisun.app.pojo;

import java.io.Serializable;

/**
 * Created by TAO on 2019-07-15.
 */
public class Orders implements Serializable {
    private Integer orderId;
    private String orderName;
    private String goodsName;
    private Integer price;
    private String buyName;
    private String adr;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", buyName='" + buyName + '\'' +
                ", adr='" + adr + '\'' +
                '}';
    }
}
