package com.cn.web.dao;

import com.cn.web.pojo.MenuPojo;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/16
 * Time:上午10:49
 */
@MapperScan
public interface SysMapper {

    List<MenuPojo> queryMenuByLev(@Param("lev")String lev);
}
