package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..address")
public class Address {
    /**
     * 地址的id
     */
    @Id
    @Column(name = "addressId")
    private Integer addressid;

    /**
     * 收获人姓名
     */
    private String receiver;

    /**
     * 配送地址
     */
    @Column(name = "deliveryAddress")
    private String deliveryaddress;

    /**
     * 详细地址
     */
    @Column(name = "detailedAddress")
    private String detailedaddress;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 座机号码
     */
    private String tel;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 标志性建筑
     */
    private String landmark;

    /**
     * 最佳送货时间
     */
    @Column(name = "bestDeliverTime")
    private String bestdelivertime;

    /**
     * 邮政编码
     */
    private String postcode;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 获取地址的id
     *
     * @return addressId - 地址的id
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * 设置地址的id
     *
     * @param addressid 地址的id
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * 获取收获人姓名
     *
     * @return receiver - 收获人姓名
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收获人姓名
     *
     * @param receiver 收获人姓名
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * 获取配送地址
     *
     * @return deliveryAddress - 配送地址
     */
    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    /**
     * 设置配送地址
     *
     * @param deliveryaddress 配送地址
     */
    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    /**
     * 获取详细地址
     *
     * @return detailedAddress - 详细地址
     */
    public String getDetailedaddress() {
        return detailedaddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailedaddress 详细地址
     */
    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取座机号码
     *
     * @return tel - 座机号码
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置座机号码
     *
     * @param tel 座机号码
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取电子邮件
     *
     * @return email - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取标志性建筑
     *
     * @return landmark - 标志性建筑
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * 设置标志性建筑
     *
     * @param landmark 标志性建筑
     */
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    /**
     * 获取最佳送货时间
     *
     * @return bestDeliverTime - 最佳送货时间
     */
    public String getBestdelivertime() {
        return bestdelivertime;
    }

    /**
     * 设置最佳送货时间
     *
     * @param bestdelivertime 最佳送货时间
     */
    public void setBestdelivertime(String bestdelivertime) {
        this.bestdelivertime = bestdelivertime;
    }

    /**
     * 获取邮政编码
     *
     * @return postcode - 邮政编码
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮政编码
     *
     * @param postcode 邮政编码
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取用户ID
     *
     * @return userId - 用户ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}