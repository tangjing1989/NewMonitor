package com.cn.web.dao;

import com.cn.web.pojo.UserPojo;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by tangjing on 17/1/10.
 */
@MapperScan
public interface UserMapper {
    int count();
    UserPojo queryUserByUserName(@Param("userName") String userName, @Param("password") String password) throws SQLException;
    List<UserPojo> queryUserList() throws SQLException;
    int queryUserListCount()throws SQLException;
}