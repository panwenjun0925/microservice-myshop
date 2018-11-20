package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..news")
public class News {
    @Id
    @Column(name = "newId")
    private Integer newid;

    @Column(name = "newsType")
    private String newstype;

    @Column(name = "newsTitle")
    private String newstitle;

    @Column(name = "newsDes")
    private String newsdes;

    /**
     * @return newId
     */
    public Integer getNewid() {
        return newid;
    }

    /**
     * @param newid
     */
    public void setNewid(Integer newid) {
        this.newid = newid;
    }

    /**
     * @return newsType
     */
    public String getNewstype() {
        return newstype;
    }

    /**
     * @param newstype
     */
    public void setNewstype(String newstype) {
        this.newstype = newstype;
    }

    /**
     * @return newsTitle
     */
    public String getNewstitle() {
        return newstitle;
    }

    /**
     * @param newstitle
     */
    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    /**
     * @return newsDes
     */
    public String getNewsdes() {
        return newsdes;
    }

    /**
     * @param newsdes
     */
    public void setNewsdes(String newsdes) {
        this.newsdes = newsdes;
    }
}