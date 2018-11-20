package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..order")
public class Order {
    /**
     * 订单ID
     */
    @Id
    @Column(name = "orderId")
    private Integer orderid;

    /**
     * 订单编号
     */
    @Column(name = "orderNum")
    private String ordernum;

    /**
     * 订单状态
     */
    @Column(name = "orderState")
    private Integer orderstate;

    /**
     * 订单创建时间
     */
    @Column(name = "orderCreateTime")
    private String ordercreatetime;

    /**
     * 订单支付时间
     */
    @Column(name = "orderPayTime")
    private String orderpaytime;

    /**
     * 订单支付方式
     */
    @Column(name = "orderPayMode")
    private Integer orderpaymode;

    /**
     * 订单金额
     */
    @Column(name = "paymentMoney")
    private Double paymentmoney;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 地址ID
     */
    @Column(name = "adressId")
    private Integer adressid;

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
     * 获取订单编号
     *
     * @return orderNum - 订单编号
     */
    public String getOrdernum() {
        return ordernum;
    }

    /**
     * 设置订单编号
     *
     * @param ordernum 订单编号
     */
    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * 获取订单状态
     *
     * @return orderState - 订单状态
     */
    public Integer getOrderstate() {
        return orderstate;
    }

    /**
     * 设置订单状态
     *
     * @param orderstate 订单状态
     */
    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    /**
     * 获取订单创建时间
     *
     * @return orderCreateTime - 订单创建时间
     */
    public String getOrdercreatetime() {
        return ordercreatetime;
    }

    /**
     * 设置订单创建时间
     *
     * @param ordercreatetime 订单创建时间
     */
    public void setOrdercreatetime(String ordercreatetime) {
        this.ordercreatetime = ordercreatetime;
    }

    /**
     * 获取订单支付时间
     *
     * @return orderPayTime - 订单支付时间
     */
    public String getOrderpaytime() {
        return orderpaytime;
    }

    /**
     * 设置订单支付时间
     *
     * @param orderpaytime 订单支付时间
     */
    public void setOrderpaytime(String orderpaytime) {
        this.orderpaytime = orderpaytime;
    }

    /**
     * 获取订单支付方式
     *
     * @return orderPayMode - 订单支付方式
     */
    public Integer getOrderpaymode() {
        return orderpaymode;
    }

    /**
     * 设置订单支付方式
     *
     * @param orderpaymode 订单支付方式
     */
    public void setOrderpaymode(Integer orderpaymode) {
        this.orderpaymode = orderpaymode;
    }

    /**
     * 获取订单金额
     *
     * @return paymentMoney - 订单金额
     */
    public Double getPaymentmoney() {
        return paymentmoney;
    }

    /**
     * 设置订单金额
     *
     * @param paymentmoney 订单金额
     */
    public void setPaymentmoney(Double paymentmoney) {
        this.paymentmoney = paymentmoney;
    }

    /**
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取地址ID
     *
     * @return adressId - 地址ID
     */
    public Integer getAdressid() {
        return adressid;
    }

    /**
     * 设置地址ID
     *
     * @param adressid 地址ID
     */
    public void setAdressid(Integer adressid) {
        this.adressid = adressid;
    }
}