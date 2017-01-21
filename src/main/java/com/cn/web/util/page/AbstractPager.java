package com.cn.web.util.page;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractPager implements IPager {
    private IPageList pageList;

    public IPageList getPageList() {
        return this.pageList;
    }

    public void setPageList(IPageList pageList) {
        this.pageList = pageList;
    }

    /*
     * (non-Javadoc)
     * @see cn.com.jiexun.utils.IPageUtil#save2Request(javax.servlet.http.HttpServletRequest, java.lang.String)
     */
    public void save2Request(HttpServletRequest request, String listName) {
        saveCommon(request);
        request.setAttribute(listName, getPageList().getResult());
    }

    private void saveCommon(HttpServletRequest request) {
        request.setAttribute("pageSize", getPageList().getPageSize());
        request.setAttribute("currentPage", getPageList().getCurrentPage());
        request.setAttribute("totalCount", getPageList().getTotalCount());
        request.setAttribute("totalPage", getPageList().getTotalPage());
        //html页面，分页组件
        request.setAttribute("pager", getPager());
    }
}