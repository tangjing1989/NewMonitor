
package com.cn.web.util.page;

import com.cn.web.util.page.IPageList;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面上分页组件的抽象 
 * 1.定义页面分页组件 
 * 2.返回页面参数 
 * 使用方式 
 * 1.IPager pager=new XxxPager(IPageList); 
 * 2.pager.save2Request(request,"listName"); 
 *
 * @author wutb1
 * 2014-4-22 下午07:36:15 
 * @version 1.0.0.0
 */
public interface IPager {

    void setPageList(IPageList pList);
    IPageList getPageList();

    /**
     * 保存PageList中的数据到页面 
     * @param request
     * @param listName
     */
    void save2Request(HttpServletRequest request,String listName);

    /**
     * 得到页面分页组件，一般包含 
     * 1.组件的html 
     * 2.分页用隐藏域 
     * 3.组件响应的js处理方法 
     *
     * @return
     */
    String getPager();


}  