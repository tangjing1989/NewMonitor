package com.cn.web.util.page;

import java.util.List;

/**
 * 分页接口，对于采用不同持久化方案的分页，继承该类并实现相应方法即可使用
 * 使用方法：
 * 1.IPageList pList=new XxxPageList([param]);//初始化，设置参数
 * 2.pList.doList();//发出实际查询
 * 3.pList.getResult();//可选，得到并处理相应数据
 * 4.IPager pager=new XxxPager(pageList);//创建分页组件类
 * 5.pager.save2Request(request,"listName");//保存数据，以及分页组件到页面
 * 6.页面合适的位置放置${pager}
 * <p>
 * 注意，sql语句要带有分页参数startNum, endNum
 *
 * @author wutb1
 *         2013-10-31 上午11:02:23
 * @version 1.0.0.0
 */
public interface IPageList<R> {
    /**
     * 发出查询
     */
    void doList();

    /**
     * 得到查询的结果，个数为pageSize的个数
     *
     * @return
     */
    List<R> getResult();

    /**
     * 设置每页大小
     *
     * @param pageSize
     */
    void setPageSize(int pageSize);

    /**
     * 得到当前设置的每页大小
     *
     * @return
     */
    int getPageSize();

    /**
     * 设置当前页
     *
     * @param currentPage
     */
    void setCurrentPage(int currentPage);

    /**
     * 得到设置的当前页
     *
     * @return
     */
    int getCurrentPage();

    /**
     * 得到符合记录的总个数
     *
     * @return
     */
    int getTotalCount();

    /**
     * 得到总的分页数
     *
     * @return
     */
    int getTotalPage();
}