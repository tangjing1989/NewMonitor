package com.cn.web.pojo;


import java.sql.Timestamp;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/10
 * Time:下午4:19
 */

public class UserPojo {

    private int    userId;
    private String userName;
    private String userCode;
    private String password;
    private Timestamp crtDate;
    private Timestamp uptDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Timestamp getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Timestamp crtDate) {
        this.crtDate = crtDate;
    }

    public Timestamp getUptDate() {
        return uptDate;
    }

    public void setUptDate(Timestamp uptDate) {
        this.uptDate = uptDate;
    }
}
