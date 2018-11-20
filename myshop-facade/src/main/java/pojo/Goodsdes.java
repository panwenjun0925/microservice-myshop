package pojo;

import javax.persistence.*;

@Table(name = "shopping..goodsDes")
public class Goodsdes {
    /**
     * 商品详情id
     */
    @Id
    @Column(name = "goodsDesId")
    private Integer goodsdesid;

    /**
     * 具体选择的商品的图片 和属性对应
     */
    @Column(name = "goodsDesPicture")
    private String goodsdespicture;

    /**
     * 具体商品的重量
     */
    @Column(name = "goodsWeight")
    private Float goodsweight;

    /**
     * 商品id
     */
    @Column(name = "goodsId")
    private Integer goodsid;

    /**
     * 具体某件商品的属性 json字符串存储
     */
    @Column(name = "goodsAttr")
    private byte[] goodsattr;

    /**
     * 获取商品详情id
     *
     * @return goodsDesId - 商品详情id
     */
    public Integer getGoodsdesid() {
        return goodsdesid;
    }

    /**
     * 设置商品详情id
     *
     * @param goodsdesid 商品详情id
     */
    public void setGoodsdesid(Integer goodsdesid) {
        this.goodsdesid = goodsdesid;
    }

    /**
     * 获取具体选择的商品的图片 和属性对应
     *
     * @return goodsDesPicture - 具体选择的商品的图片 和属性对应
     */
    public String getGoodsdespicture() {
        return goodsdespicture;
    }

    /**
     * 设置具体选择的商品的图片 和属性对应
     *
     * @param goodsdespicture 具体选择的商品的图片 和属性对应
     */
    public void setGoodsdespicture(String goodsdespicture) {
        this.goodsdespicture = goodsdespicture;
    }

    /**
     * 获取具体商品的重量
     *
     * @return goodsWeight - 具体商品的重量
     */
    public Float getGoodsweight() {
        return goodsweight;
    }

    /**
     * 设置具体商品的重量
     *
     * @param goodsweight 具体商品的重量
     */
    public void setGoodsweight(Float goodsweight) {
        this.goodsweight = goodsweight;
    }

    /**
     * 获取商品id
     *
     * @return goodsId - 商品id
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * 设置商品id
     *
     * @param goodsid 商品id
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * 获取具体某件商品的属性 json字符串存储
     *
     * @return goodsAttr - 具体某件商品的属性 json字符串存储
     */
    public byte[] getGoodsattr() {
        return goodsattr;
    }

    /**
     * 设置具体某件商品的属性 json字符串存储
     *
     * @param goodsattr 具体某件商品的属性 json字符串存储
     */
    public void setGoodsattr(byte[] goodsattr) {
        this.goodsattr = goodsattr;
    }
}