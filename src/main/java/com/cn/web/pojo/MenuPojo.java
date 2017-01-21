package com.cn.web.pojo;

import java.util.List;

/**
 * Describe:菜单实体
 * User:tangjing
 * Date:17/1/16
 * Time:上午10:43
 */

public class MenuPojo {

    private int    menuId;
    private String menuCode;
    private String menuName;
    private String menuHref;
    private String parentCode;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}