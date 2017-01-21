package com.cn.web.service;

import com.cn.web.dao.UserMapper;
import com.cn.web.pojo.UserPojo;
import com.cn.web.util.page.IPageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/10
 * Time:下午4:43
 */
@Service
public class UserImpl implements IUserImpl {

    @Autowired
    UserMapper userMapper;

    public UserPojo getUser(String userName, String password) throws SQLException {

        return userMapper.queryUserByUserName(userName, password);
    }


    public List<UserPojo> queryUserList() throws  SQLException
    {
        return  userMapper.queryUserList();
    }

    public int queryUserListCount() throws SQLException
    {
        return userMapper.queryUserListCount();
    }




}
