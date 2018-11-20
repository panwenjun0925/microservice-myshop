package pojo;

import javax.persistence.*;

@Table(name = "shopping..goods")
public class Goods {
    /**
     * 商品的ID
     */
    @Id
    @Column(name = "goodsId")
    private Integer goodsid;

    /**
     * 商品的名字
     */
    @Column(name = "goodsName")
    private String goodsname;

    /**
     * 商品的展示价格
     */
    @Column(name = "goodsShowPrice")
    private Float goodsshowprice;

    /**
     * 商品展示的图片地址
     */
    @Column(name = "goodsShowPicture")
    private String goodsshowpicture;

    /**
     * 是否上架
     */
    @Column(name = "isPutaway")
    private Integer isputaway;

    /**
     * 商品折扣力度
     */
    @Column(name = "goodsDiscount")
    private Float goodsdiscount;

    /**
     * 商品最后交易价格
     */
    @Column(name = "goodsRealPrice")
    private Float goodsrealprice;

    /**
     * 商品总数量
     */
    @Column(name = "goodsTotal")
    private Integer goodstotal;

    /**
     * 这个商品所属的类别
     */
    @Column(name = "goodsTypeId")
    private Integer goodstypeid;

    /**
     * 获取商品的ID
     *
     * @return goodsId - 商品的ID
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * 设置商品的ID
     *
     * @param goodsid 商品的ID
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * 获取商品的名字
     *
     * @return goodsName - 商品的名字
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * 设置商品的名字
     *
     * @param goodsname 商品的名字
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    /**
     * 获取商品的展示价格
     *
     * @return goodsShowPrice - 商品的展示价格
     */
    public Float getGoodsshowprice() {
        return goodsshowprice;
    }

    /**
     * 设置商品的展示价格
     *
     * @param goodsshowprice 商品的展示价格
     */
    public void setGoodsshowprice(Float goodsshowprice) {
        this.goodsshowprice = goodsshowprice;
    }

    /**
     * 获取商品展示的图片地址
     *
     * @return goodsShowPicture - 商品展示的图片地址
     */
    public String getGoodsshowpicture() {
        return goodsshowpicture;
    }

    /**
     * 设置商品展示的图片地址
     *
     * @param goodsshowpicture 商品展示的图片地址
     */
    public void setGoodsshowpicture(String goodsshowpicture) {
        this.goodsshowpicture = goodsshowpicture;
    }

    /**
     * 获取是否上架
     *
     * @return isPutaway - 是否上架
     */
    public Integer getIsputaway() {
        return isputaway;
    }

    /**
     * 设置是否上架
     *
     * @param isputaway 是否上架
     */
    public void setIsputaway(Integer isputaway) {
        this.isputaway = isputaway;
    }

    /**
     * 获取商品折扣力度
     *
     * @return goodsDiscount - 商品折扣力度
     */
    public Float getGoodsdiscount() {
        return goodsdiscount;
    }

    /**
     * 设置商品折扣力度
     *
     * @param goodsdiscount 商品折扣力度
     */
    public void setGoodsdiscount(Float goodsdiscount) {
        this.goodsdiscount = goodsdiscount;
    }

    /**
     * 获取商品最后交易价格
     *
     * @return goodsRealPrice - 商品最后交易价格
     */
    public Float getGoodsrealprice() {
        return goodsrealprice;
    }

    /**
     * 设置商品最后交易价格
     *
     * @param goodsrealprice 商品最后交易价格
     */
    public void setGoodsrealprice(Float goodsrealprice) {
        this.goodsrealprice = goodsrealprice;
    }

    /**
     * 获取商品总数量
     *
     * @return goodsTotal - 商品总数量
     */
    public Integer getGoodstotal() {
        return goodstotal;
    }

    /**
     * 设置商品总数量
     *
     * @param goodstotal 商品总数量
     */
    public void setGoodstotal(Integer goodstotal) {
        this.goodstotal = goodstotal;
    }

    /**
     * 获取这个商品所属的类别
     *
     * @return goodsTypeId - 这个商品所属的类别
     */
    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    /**
     * 设置这个商品所属的类别
     *
     * @param goodstypeid 这个商品所属的类别
     */
    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }
}