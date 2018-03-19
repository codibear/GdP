package com.codiibear.GdP.domain;

/**
 * Created by codiibear on 2018/3/19.
 */
public class Customer {
    private Integer userId;
    private String username;
    private String userpassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
