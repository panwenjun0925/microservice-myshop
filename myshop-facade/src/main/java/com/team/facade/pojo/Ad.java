package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..ad")
public class Ad {
    @Id
    @Column(name = "adId")
    private Integer adid;

    @Column(name = "adDes")
    private String addes;

    @Column(name = "adPicture")
    private String adpicture;

    @Column(name = "adType")
    private Integer adtype;

    /**
     * @return adId
     */
    public Integer getAdid() {
        return adid;
    }

    /**
     * @param adid
     */
    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    /**
     * @return adDes
     */
    public String getAddes() {
        return addes;
    }

    /**
     * @param addes
     */
    public void setAddes(String addes) {
        this.addes = addes;
    }

    /**
     * @return adPicture
     */
    public String getAdpicture() {
        return adpicture;
    }

    /**
     * @param adpicture
     */
    public void setAdpicture(String adpicture) {
        this.adpicture = adpicture;
    }

    /**
     * @return adType
     */
    public Integer getAdtype() {
        return adtype;
    }

    /**
     * @param adtype
     */
    public void setAdtype(Integer adtype) {
        this.adtype = adtype;
    }
}