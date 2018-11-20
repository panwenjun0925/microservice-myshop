package com.team.facade.pojo;

import javax.persistence.*;

@Table(name = "shopping..user")
public class User {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "userId")
    private Integer userid;

    /**
     * 用户编号
     */
    @Column(name = "userNumber")
    private String usernumber;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 注册时间
     */
    @Column(name = "registerTime")
    private String registertime;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 身份证号码
     */
    @Column(name = "idCard")
    private String idcard;

    /**
     * 邀请人的Id
     */
    @Column(name = "inviterId")
    private String inviterid;

    /**
     * 密码
     */
    private String password;

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

    /**
     * 获取用户编号
     *
     * @return userNumber - 用户编号
     */
    public String getUsernumber() {
        return usernumber;
    }

    /**
     * 设置用户编号
     *
     * @param usernumber 用户编号
     */
    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    /**
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取注册时间
     *
     * @return registerTime - 注册时间
     */
    public String getRegistertime() {
        return registertime;
    }

    /**
     * 设置注册时间
     *
     * @param registertime 注册时间
     */
    public void setRegistertime(String registertime) {
        this.registertime = registertime;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取身份证号码
     *
     * @return idCard - 身份证号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号码
     *
     * @param idcard 身份证号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取邀请人的Id
     *
     * @return inviterId - 邀请人的Id
     */
    public String getInviterid() {
        return inviterid;
    }

    /**
     * 设置邀请人的Id
     *
     * @param inviterid 邀请人的Id
     */
    public void setInviterid(String inviterid) {
        this.inviterid = inviterid;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}