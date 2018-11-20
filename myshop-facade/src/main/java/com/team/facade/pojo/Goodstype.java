package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..goodsType")
public class Goodstype {
    /**
     * 商品类别ID
     */
    @Id
    @Column(name = "typeId")
    private Integer typeid;

    /**
     * 此类的名字
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * 此类的父类
     */
    @Column(name = "typeParentId")
    private Integer typeparentid;

    /**
     * 商品类型的图片
     */
    @Column(name = "typePicture")
    private String typepicture;

    /**
     * 此类别的描述
     */
    @Column(name = "typeDes")
    private byte[] typedes;

    /**
     * 获取商品类别ID
     *
     * @return typeId - 商品类别ID
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * 设置商品类别ID
     *
     * @param typeid 商品类别ID
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取此类的名字
     *
     * @return typeName - 此类的名字
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置此类的名字
     *
     * @param typename 此类的名字
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
     * 获取此类的父类
     *
     * @return typeParentId - 此类的父类
     */
    public Integer getTypeparentid() {
        return typeparentid;
    }

    /**
     * 设置此类的父类
     *
     * @param typeparentid 此类的父类
     */
    public void setTypeparentid(Integer typeparentid) {
        this.typeparentid = typeparentid;
    }

    /**
     * 获取商品类型的图片
     *
     * @return typePicture - 商品类型的图片
     */
    public String getTypepicture() {
        return typepicture;
    }

    /**
     * 设置商品类型的图片
     *
     * @param typepicture 商品类型的图片
     */
    public void setTypepicture(String typepicture) {
        this.typepicture = typepicture;
    }

    /**
     * 获取此类别的描述
     *
     * @return typeDes - 此类别的描述
     */
    public byte[] getTypedes() {
        return typedes;
    }

    /**
     * 设置此类别的描述
     *
     * @param typedes 此类别的描述
     */
    public void setTypedes(byte[] typedes) {
        this.typedes = typedes;
    }
}