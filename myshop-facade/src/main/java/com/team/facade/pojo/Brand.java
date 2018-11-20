package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..brand")
public class Brand {
    @Id
    @Column(name = "brandId")
    private Integer brandid;

    @Column(name = "brandName")
    private String brandname;

    @Column(name = "brandLog")
    private String brandlog;

    /**
     * @return brandId
     */
    public Integer getBrandid() {
        return brandid;
    }

    /**
     * @param brandid
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    /**
     * @return brandName
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * @param brandname
     */
    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    /**
     * @return brandLog
     */
    public String getBrandlog() {
        return brandlog;
    }

    /**
     * @param brandlog
     */
    public void setBrandlog(String brandlog) {
        this.brandlog = brandlog;
    }
}