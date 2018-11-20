package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..orderDes")
public class Orderdes {
    /**
     * 订单详情ID
     */
    @Id
    @Column(name = "orderDesId")
    private Integer orderdesid;

    /**
     * 商品数量
     */
    @Column(name = "goodsNum")
    private Integer goodsnum;

    /**
     * 订单编号
     */
    @Column(name = "orderNumber")
    private String ordernumber;

    /**
     * 订单ID
     */
    @Column(name = "orderId")
    private Integer orderid;

    /**
     * 商品ID
     */
    @Column(name = "goodsId")
    private Integer goodsid;

    /**
     * 获取订单详情ID
     *
     * @return orderDesId - 订单详情ID
     */
    public Integer getOrderdesid() {
        return orderdesid;
    }

    /**
     * 设置订单详情ID
     *
     * @param orderdesid 订单详情ID
     */
    public void setOrderdesid(Integer orderdesid) {
        this.orderdesid = orderdesid;
    }

    /**
     * 获取商品数量
     *
     * @return goodsNum - 商品数量
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * 设置商品数量
     *
     * @param goodsnum 商品数量
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * 获取订单编号
     *
     * @return orderNumber - 订单编号
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * 设置订单编号
     *
     * @param ordernumber 订单编号
     */
    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    /**
     * 获取订单ID
     *
     * @return orderId - 订单ID
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * 设置订单ID
     *
     * @param orderid 订单ID
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取商品ID
     *
     * @return goodsId - 商品ID
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * 设置商品ID
     *
     * @param goodsid 商品ID
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
}