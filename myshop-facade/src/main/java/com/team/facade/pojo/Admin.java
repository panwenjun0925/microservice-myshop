package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..admin")
public class Admin {
    @Id
    @Column(name = "adminId")
    private Integer adminid;

    @Column(name = "adminName")
    private String adminname;

    @Column(name = "adminPassword")
    private String adminpassword;

    /**
     * @return adminId
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * @param adminid
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * @return adminName
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * @param adminname
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    /**
     * @return adminPassword
     */
    public String getAdminpassword() {
        return adminpassword;
    }

    /**
     * @param adminpassword
     */
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }
}