package com.cn.web.util.page;

import java.sql.SQLException;
import java.util.List;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/23
 * Time:下午4:52
 */

public interface IPageImpl<T> {


    List<T> queryPage(String aodate) throws SQLException;

    int totalRecodeNum() throws SQLException;

}
