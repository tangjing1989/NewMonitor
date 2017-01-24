package com.cn.web.pojo;


import com.cn.web.util.page.PageBaseUtil;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/10
 * Time:下午4:19
 */

public class UserPojo  extends PageBaseUtil{

    private int    userId;
    private String userName;
    private String userCode;
    private String password;
    private String crtDate;
    private String uptDate;

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

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public String getUptDate() {
        return uptDate;
    }

    public void setUptDate(String uptDate) {
        this.uptDate = uptDate;
    }
}
